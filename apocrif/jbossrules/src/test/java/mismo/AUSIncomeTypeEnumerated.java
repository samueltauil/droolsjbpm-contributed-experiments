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
 * <p>Java class for AUS_IncomeTypeEnumerated.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUS_IncomeTypeEnumerated">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AlimonyChildSupport"/>
 *     &lt;enumeration value="AutomobileExpenseAccount"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Bonus"/>
 *     &lt;enumeration value="Commissions"/>
 *     &lt;enumeration value="DividendsInterest"/>
 *     &lt;enumeration value="FosterCare"/>
 *     &lt;enumeration value="NetRentalIncome"/>
 *     &lt;enumeration value="NotesReceivableInstallment"/>
 *     &lt;enumeration value="OtherTypesOfIncome"/>
 *     &lt;enumeration value="Overtime"/>
 *     &lt;enumeration value="Pension"/>
 *     &lt;enumeration value="SocialSecurity"/>
 *     &lt;enumeration value="SubjectPropertyNetCashFlow"/>
 *     &lt;enumeration value="Trust"/>
 *     &lt;enumeration value="Unemployment"/>
 *     &lt;enumeration value="PublicAssistance"/>
 *     &lt;enumeration value="VABenefitsNonEducational"/>
 *     &lt;enumeration value="MortgageDifferential"/>
 *     &lt;enumeration value="MilitaryBasePay"/>
 *     &lt;enumeration value="MilitaryRationsAllowance"/>
 *     &lt;enumeration value="MilitaryFlightPay"/>
 *     &lt;enumeration value="MilitaryHazardPay"/>
 *     &lt;enumeration value="MilitaryClothesAllowance"/>
 *     &lt;enumeration value="MilitaryQuartersAllowance"/>
 *     &lt;enumeration value="MilitaryPropPay"/>
 *     &lt;enumeration value="MilitaryOverseasPay"/>
 *     &lt;enumeration value="MilitaryCombatPay"/>
 *     &lt;enumeration value="MilitaryVariableHousingAllowance"/>
 *     &lt;enumeration value="ContractBasis"/>
 *     &lt;enumeration value="BoarderIncome"/>
 *     &lt;enumeration value="MortgageCreditCertificate"/>
 *     &lt;enumeration value="TrailingCoBorrowerIncome"/>
 *     &lt;enumeration value="BorrowerEstimatedTotalMonthlyIncome"/>
 *     &lt;enumeration value="ProposedGrossRentForSubjectProperty"/>
 *     &lt;enumeration value="RealEstateOwnedGrossRentalIncome"/>
 *     &lt;enumeration value="WorkersCompensation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUS_IncomeTypeEnumerated")
@XmlEnum
public enum AUSIncomeTypeEnumerated {

    @XmlEnumValue("AlimonyChildSupport")
    ALIMONY_CHILD_SUPPORT("AlimonyChildSupport"),
    @XmlEnumValue("AutomobileExpenseAccount")
    AUTOMOBILE_EXPENSE_ACCOUNT("AutomobileExpenseAccount"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Bonus")
    BONUS("Bonus"),
    @XmlEnumValue("Commissions")
    COMMISSIONS("Commissions"),
    @XmlEnumValue("DividendsInterest")
    DIVIDENDS_INTEREST("DividendsInterest"),
    @XmlEnumValue("FosterCare")
    FOSTER_CARE("FosterCare"),
    @XmlEnumValue("NetRentalIncome")
    NET_RENTAL_INCOME("NetRentalIncome"),
    @XmlEnumValue("NotesReceivableInstallment")
    NOTES_RECEIVABLE_INSTALLMENT("NotesReceivableInstallment"),
    @XmlEnumValue("OtherTypesOfIncome")
    OTHER_TYPES_OF_INCOME("OtherTypesOfIncome"),
    @XmlEnumValue("Overtime")
    OVERTIME("Overtime"),
    @XmlEnumValue("Pension")
    PENSION("Pension"),
    @XmlEnumValue("SocialSecurity")
    SOCIAL_SECURITY("SocialSecurity"),
    @XmlEnumValue("SubjectPropertyNetCashFlow")
    SUBJECT_PROPERTY_NET_CASH_FLOW("SubjectPropertyNetCashFlow"),
    @XmlEnumValue("Trust")
    TRUST("Trust"),
    @XmlEnumValue("Unemployment")
    UNEMPLOYMENT("Unemployment"),
    @XmlEnumValue("PublicAssistance")
    PUBLIC_ASSISTANCE("PublicAssistance"),
    @XmlEnumValue("VABenefitsNonEducational")
    VA_BENEFITS_NON_EDUCATIONAL("VABenefitsNonEducational"),
    @XmlEnumValue("MortgageDifferential")
    MORTGAGE_DIFFERENTIAL("MortgageDifferential"),
    @XmlEnumValue("MilitaryBasePay")
    MILITARY_BASE_PAY("MilitaryBasePay"),
    @XmlEnumValue("MilitaryRationsAllowance")
    MILITARY_RATIONS_ALLOWANCE("MilitaryRationsAllowance"),
    @XmlEnumValue("MilitaryFlightPay")
    MILITARY_FLIGHT_PAY("MilitaryFlightPay"),
    @XmlEnumValue("MilitaryHazardPay")
    MILITARY_HAZARD_PAY("MilitaryHazardPay"),
    @XmlEnumValue("MilitaryClothesAllowance")
    MILITARY_CLOTHES_ALLOWANCE("MilitaryClothesAllowance"),
    @XmlEnumValue("MilitaryQuartersAllowance")
    MILITARY_QUARTERS_ALLOWANCE("MilitaryQuartersAllowance"),
    @XmlEnumValue("MilitaryPropPay")
    MILITARY_PROP_PAY("MilitaryPropPay"),
    @XmlEnumValue("MilitaryOverseasPay")
    MILITARY_OVERSEAS_PAY("MilitaryOverseasPay"),
    @XmlEnumValue("MilitaryCombatPay")
    MILITARY_COMBAT_PAY("MilitaryCombatPay"),
    @XmlEnumValue("MilitaryVariableHousingAllowance")
    MILITARY_VARIABLE_HOUSING_ALLOWANCE("MilitaryVariableHousingAllowance"),
    @XmlEnumValue("ContractBasis")
    CONTRACT_BASIS("ContractBasis"),
    @XmlEnumValue("BoarderIncome")
    BOARDER_INCOME("BoarderIncome"),
    @XmlEnumValue("MortgageCreditCertificate")
    MORTGAGE_CREDIT_CERTIFICATE("MortgageCreditCertificate"),
    @XmlEnumValue("TrailingCoBorrowerIncome")
    TRAILING_CO_BORROWER_INCOME("TrailingCoBorrowerIncome"),
    @XmlEnumValue("BorrowerEstimatedTotalMonthlyIncome")
    BORROWER_ESTIMATED_TOTAL_MONTHLY_INCOME("BorrowerEstimatedTotalMonthlyIncome"),
    @XmlEnumValue("ProposedGrossRentForSubjectProperty")
    PROPOSED_GROSS_RENT_FOR_SUBJECT_PROPERTY("ProposedGrossRentForSubjectProperty"),
    @XmlEnumValue("RealEstateOwnedGrossRentalIncome")
    REAL_ESTATE_OWNED_GROSS_RENTAL_INCOME("RealEstateOwnedGrossRentalIncome"),
    @XmlEnumValue("WorkersCompensation")
    WORKERS_COMPENSATION("WorkersCompensation");
    private final String value;

    AUSIncomeTypeEnumerated(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUSIncomeTypeEnumerated fromValue(String v) {
        for (AUSIncomeTypeEnumerated c: AUSIncomeTypeEnumerated.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}