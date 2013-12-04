/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel;

import jucm_OneFileWorkaround.grl.GRLspec;

import jucm_OneFileWorkaround.urncore.GRLmodelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The default four groups are:
 * TimeMeasure
 * CostMeasure
 * QualityMeasure
 * FlexibilityMeasure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#isIsRedesignCategory <em>Is Redesign Category</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#getIndicators <em>Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicatorGroup()
 * @model
 * @generated
 */
public interface IndicatorGroup extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Is Redesign Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Redesign Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Redesign Category</em>' attribute.
	 * @see #setIsRedesignCategory(boolean)
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicatorGroup_IsRedesignCategory()
	 * @model
	 * @generated
	 */
	boolean isIsRedesignCategory();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#isIsRedesignCategory <em>Is Redesign Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Redesign Category</em>' attribute.
	 * @see #isIsRedesignCategory()
	 * @generated
	 */
	void setIsRedesignCategory(boolean value);

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getIndicatorGroup <em>Indicator Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicatorGroup_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getIndicatorGroup
	 * @model opposite="indicatorGroup" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Indicators</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.Indicator}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.Indicator#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicators</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicatorGroup_Indicators()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.Indicator#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<Indicator> getIndicators();

} // IndicatorGroup