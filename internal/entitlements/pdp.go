package entitlements

import (
	"github.com/opentdf/platform/protocol/go/authorization"
	"github.com/opentdf/platform/protocol/go/policy/attributes"
)

func OpaInput(entity *authorization.Entity, sms map[string]*attributes.GetAttributeValuesByFqnsResponse_AttributeAndValue, config map[string]interface{}) (map[string]interface{}, error) {
	// OPA wants this as a generic map[string]interface{} and will not handle
	// deserializing to concrete structs
	inputUnstructured := make(map[string]interface{})
	// SubjectMapping
	inputUnstructured["attribute_mappings"] = sms
	// Entity
	ea := make(map[string]interface{})
	ea["id"] = entity.Id
	ea["email_address"] = entity.GetEmailAddress()
	inputUnstructured["entity"] = ea

	inputUnstructured["idp"] = config
	return inputUnstructured, nil
}
