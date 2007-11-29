//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.21 at 09:59:49 PM BST 
//


package mismo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUS_HousingExpenseTypeEnumerated.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUS_HousingExpenseTypeEnumerated">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstMortgagePrincipalAndInterest"/>
 *     &lt;enumeration value="GroundRent"/>
 *     &lt;enumeration value="HazardInsurance"/>
 *     &lt;enumeration value="HomeownersAssociationDuesAndCondominiumFees"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="OtherHousingExpense"/>
 *     &lt;enumeration value="OtherMortgageLoanPrincipalAndInterest"/>
 *     &lt;enumeration value="RealEstateTax"/>
 *     &lt;enumeration value="FirstMortgagePITI"/>
 *     &lt;enumeration value="LeaseholdPayments"/>
 *     &lt;enumeration value="MaintenanceAndMiscellaneous"/>
 *     &lt;enumeration value="OtherMortgageLoanPrincipalInterestTaxesAndInsurance"/>
 *     &lt;enumeration value="Rent"/>
 *     &lt;enumeration value="Utilities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUS_HousingExpenseTypeEnumerated")
@XmlEnum
public enum AUSHousingExpenseTypeEnumerated {

    @XmlEnumValue("FirstMortgagePrincipalAndInterest")
    FIRST_MORTGAGE_PRINCIPAL_AND_INTEREST("FirstMortgagePrincipalAndInterest"),
    @XmlEnumValue("GroundRent")
    GROUND_RENT("GroundRent"),
    @XmlEnumValue("HazardInsurance")
    HAZARD_INSURANCE("HazardInsurance"),
    @XmlEnumValue("HomeownersAssociationDuesAndCondominiumFees")
    HOMEOWNERS_ASSOCIATION_DUES_AND_CONDOMINIUM_FEES("HomeownersAssociationDuesAndCondominiumFees"),
    MI("MI"),
    @XmlEnumValue("OtherHousingExpense")
    OTHER_HOUSING_EXPENSE("OtherHousingExpense"),
    @XmlEnumValue("OtherMortgageLoanPrincipalAndInterest")
    OTHER_MORTGAGE_LOAN_PRINCIPAL_AND_INTEREST("OtherMortgageLoanPrincipalAndInterest"),
    @XmlEnumValue("RealEstateTax")
    REAL_ESTATE_TAX("RealEstateTax"),
    @XmlEnumValue("FirstMortgagePITI")
    FIRST_MORTGAGE_PITI("FirstMortgagePITI"),
    @XmlEnumValue("LeaseholdPayments")
    LEASEHOLD_PAYMENTS("LeaseholdPayments"),
    @XmlEnumValue("MaintenanceAndMiscellaneous")
    MAINTENANCE_AND_MISCELLANEOUS("MaintenanceAndMiscellaneous"),
    @XmlEnumValue("OtherMortgageLoanPrincipalInterestTaxesAndInsurance")
    OTHER_MORTGAGE_LOAN_PRINCIPAL_INTEREST_TAXES_AND_INSURANCE("OtherMortgageLoanPrincipalInterestTaxesAndInsurance"),
    @XmlEnumValue("Rent")
    RENT("Rent"),
    @XmlEnumValue("Utilities")
    UTILITIES("Utilities");
    private final String value;

    AUSHousingExpenseTypeEnumerated(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUSHousingExpenseTypeEnumerated fromValue(String v) {
        for (AUSHousingExpenseTypeEnumerated c: AUSHousingExpenseTypeEnumerated.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}