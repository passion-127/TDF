package cmd

import (
	"bytes"
	"io"
	"os"

	"github.com/opentdf/platform/sdk"
	"github.com/spf13/cobra"
)

func init() {
	var decryptCmd = &cobra.Command{
		Use:   "decrypt",
		Short: "Decrypt TDF file",
		RunE:  decrypt,
		Args:  cobra.MinimumNArgs(1),
	}
	ExamplesCmd.AddCommand(decryptCmd)
}

func decrypt(cmd *cobra.Command, args []string) error {
	if len(args) < 1 {
		return cmd.Usage()
	}

	tdfFile := args[0]

	// Create new client
	client, err := sdk.New(cmd.Context().Value(RootConfigKey).(*ExampleConfig).PlatformEndpoint,
		sdk.WithInsecurePlaintextConn(),
		sdk.WithClientCredentials("opentdf-sdk", "secret", nil),
		sdk.WithTokenEndpoint("http://localhost:8888/auth/realms/opentdf/protocol/openid-connect/token"),
	)
	if err != nil {
		return err
	}
	file, err := os.Open(tdfFile)
	if err != nil {
		return err
	}

	defer file.Close()
	cmd.Println("# TDF")

	tdfreader, err := client.LoadTDF(file)
	if err != nil {
		return err
	}

	//Print decrypted string
	_, err = io.Copy(os.Stdout, tdfreader)
	if err != nil && err != io.EOF {
		return err
	}
	cmd.Println("\n-----\n\n# NANO")

	nTdfFile, err := os.Open("sensitive.txt.ntdf")
	if err != nil {
		return err
	}

	outBuf := bytes.Buffer{}
	_, err = client.ReadNanoTDF(io.Writer(&outBuf), nTdfFile)
	if err != nil {
		return err
	}

	if "Hello Virtru" == outBuf.String() {
		cmd.Println("✅ NanoTDF test passed!")
	} else {
		cmd.Println("❌ NanoTDF test failed!")
	}

	return nil
}
