/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package urncore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see urncore.UrncoreFactory
 * @generated
 */
public interface UrncorePackage extends EPackage{
    /**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "urncore";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http:///urncore.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "urncore";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	UrncorePackage eINSTANCE = urncore.impl.UrncorePackageImpl.init();

    /**
     * The meta object id for the '{@link urncore.impl.URNdefinitionImpl <em>UR Ndefinition</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.URNdefinitionImpl
     * @see urncore.impl.UrncorePackageImpl#getURNdefinition()
     * @generated
     */
	int UR_NDEFINITION = 0;

    /**
     * The feature id for the '<em><b>Urnspec</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UR_NDEFINITION__URNSPEC = 0;

    /**
     * The feature id for the '<em><b>Responsibilities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UR_NDEFINITION__RESPONSIBILITIES = 1;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UR_NDEFINITION__COMPONENTS = 2;

    /**
     * The feature id for the '<em><b>GR Lelements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UR_NDEFINITION__GR_LELEMENTS = 3;

    /**
     * The number of structural features of the the '<em>UR Ndefinition</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UR_NDEFINITION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link urncore.impl.UCMmodelElementImpl <em>UC Mmodel Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.UCMmodelElementImpl
     * @see urncore.impl.UrncorePackageImpl#getUCMmodelElement()
     * @generated
     */
	int UC_MMODEL_ELEMENT = 8;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UC_MMODEL_ELEMENT__URN_LINKS = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UC_MMODEL_ELEMENT__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UC_MMODEL_ELEMENT__NAME = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UC_MMODEL_ELEMENT__DESCRIPTION = 3;

    /**
     * The number of structural features of the the '<em>UC Mmodel Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UC_MMODEL_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link urncore.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ResponsibilityImpl
     * @see urncore.impl.UrncorePackageImpl#getResponsibility()
     * @generated
     */
	int RESPONSIBILITY = 1;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__URN_LINKS = UC_MMODEL_ELEMENT__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__ID = UC_MMODEL_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__NAME = UC_MMODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__DESCRIPTION = UC_MMODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Empty</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__EMPTY = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__URNDEFINITION = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Demands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__DEMANDS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Resp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY__RESP_REFS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the the '<em>Responsibility</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSIBILITY_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link urncore.impl.ComponentElementImpl <em>Component Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ComponentElementImpl
     * @see urncore.impl.UrncorePackageImpl#getComponentElement()
     * @generated
     */
	int COMPONENT_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__URN_LINKS = UC_MMODEL_ELEMENT__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__ID = UC_MMODEL_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__NAME = UC_MMODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__DESCRIPTION = UC_MMODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__LINE_COLOR = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__FILL_COLOR = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Filled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__FILLED = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__URNDEFINITION = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Including Component</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__INCLUDING_COMPONENT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__RESOURCE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Comp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT__COMP_REFS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the the '<em>Component Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_ELEMENT_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link urncore.impl.ComponentRegularImpl <em>Component Regular</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ComponentRegularImpl
     * @see urncore.impl.UrncorePackageImpl#getComponentRegular()
     * @generated
     */
	int COMPONENT_REGULAR = 2;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__URN_LINKS = COMPONENT_ELEMENT__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__ID = COMPONENT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__NAME = COMPONENT_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__LINE_COLOR = COMPONENT_ELEMENT__LINE_COLOR;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__FILL_COLOR = COMPONENT_ELEMENT__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Filled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__FILLED = COMPONENT_ELEMENT__FILLED;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__URNDEFINITION = COMPONENT_ELEMENT__URNDEFINITION;

    /**
     * The feature id for the '<em><b>Including Component</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__INCLUDING_COMPONENT = COMPONENT_ELEMENT__INCLUDING_COMPONENT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__RESOURCE = COMPONENT_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Comp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__COMP_REFS = COMPONENT_ELEMENT__COMP_REFS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__KIND = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__PROTECTED = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Slot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__SLOT = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Included Component</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__INCLUDED_COMPONENT = COMPONENT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Host</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR__HOST = COMPONENT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the the '<em>Component Regular</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REGULAR_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link urncore.impl.PoolImpl <em>Pool</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.PoolImpl
     * @see urncore.impl.UrncorePackageImpl#getPool()
     * @generated
     */
	int POOL = 4;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__URN_LINKS = COMPONENT_ELEMENT__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__ID = COMPONENT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__NAME = COMPONENT_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__LINE_COLOR = COMPONENT_ELEMENT__LINE_COLOR;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__FILL_COLOR = COMPONENT_ELEMENT__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Filled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__FILLED = COMPONENT_ELEMENT__FILLED;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__URNDEFINITION = COMPONENT_ELEMENT__URNDEFINITION;

    /**
     * The feature id for the '<em><b>Including Component</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__INCLUDING_COMPONENT = COMPONENT_ELEMENT__INCLUDING_COMPONENT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__RESOURCE = COMPONENT_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Comp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__COMP_REFS = COMPONENT_ELEMENT__COMP_REFS;

    /**
     * The feature id for the '<em><b>Of Components</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__OF_COMPONENTS = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__CONTENT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Component Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__COMPONENT_TYPE = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Dyn Responsibilities</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL__DYN_RESPONSIBILITIES = COMPONENT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the the '<em>Pool</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POOL_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link urncore.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ComponentImpl
     * @see urncore.impl.UrncorePackageImpl#getComponent()
     * @generated
     */
	int COMPONENT = 5;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__URN_LINKS = COMPONENT_REGULAR__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__ID = COMPONENT_REGULAR__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__NAME = COMPONENT_REGULAR__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__DESCRIPTION = COMPONENT_REGULAR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__LINE_COLOR = COMPONENT_REGULAR__LINE_COLOR;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__FILL_COLOR = COMPONENT_REGULAR__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Filled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__FILLED = COMPONENT_REGULAR__FILLED;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__URNDEFINITION = COMPONENT_REGULAR__URNDEFINITION;

    /**
     * The feature id for the '<em><b>Including Component</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__INCLUDING_COMPONENT = COMPONENT_REGULAR__INCLUDING_COMPONENT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__RESOURCE = COMPONENT_REGULAR__RESOURCE;

    /**
     * The feature id for the '<em><b>Comp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__COMP_REFS = COMPONENT_REGULAR__COMP_REFS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__KIND = COMPONENT_REGULAR__KIND;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__PROTECTED = COMPONENT_REGULAR__PROTECTED;

    /**
     * The feature id for the '<em><b>Slot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__SLOT = COMPONENT_REGULAR__SLOT;

    /**
     * The feature id for the '<em><b>Included Component</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__INCLUDED_COMPONENT = COMPONENT_REGULAR__INCLUDED_COMPONENT;

    /**
     * The feature id for the '<em><b>Host</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__HOST = COMPONENT_REGULAR__HOST;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__TYPE = COMPONENT_REGULAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_FEATURE_COUNT = COMPONENT_REGULAR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link urncore.impl.ComponentTypeImpl <em>Component Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ComponentTypeImpl
     * @see urncore.impl.UrncorePackageImpl#getComponentType()
     * @generated
     */
	int COMPONENT_TYPE = 6;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__URN_LINKS = COMPONENT_REGULAR__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__ID = COMPONENT_REGULAR__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__NAME = COMPONENT_REGULAR__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__DESCRIPTION = COMPONENT_REGULAR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__LINE_COLOR = COMPONENT_REGULAR__LINE_COLOR;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__FILL_COLOR = COMPONENT_REGULAR__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Filled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__FILLED = COMPONENT_REGULAR__FILLED;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__URNDEFINITION = COMPONENT_REGULAR__URNDEFINITION;

    /**
     * The feature id for the '<em><b>Including Component</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__INCLUDING_COMPONENT = COMPONENT_REGULAR__INCLUDING_COMPONENT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__RESOURCE = COMPONENT_REGULAR__RESOURCE;

    /**
     * The feature id for the '<em><b>Comp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__COMP_REFS = COMPONENT_REGULAR__COMP_REFS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__KIND = COMPONENT_REGULAR__KIND;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__PROTECTED = COMPONENT_REGULAR__PROTECTED;

    /**
     * The feature id for the '<em><b>Slot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__SLOT = COMPONENT_REGULAR__SLOT;

    /**
     * The feature id for the '<em><b>Included Component</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__INCLUDED_COMPONENT = COMPONENT_REGULAR__INCLUDED_COMPONENT;

    /**
     * The feature id for the '<em><b>Host</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__HOST = COMPONENT_REGULAR__HOST;

    /**
     * The feature id for the '<em><b>Sub Type</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__SUB_TYPE = COMPONENT_REGULAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__SUPER_TYPE = COMPONENT_REGULAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__INSTANCES = COMPONENT_REGULAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pools</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__POOLS = COMPONENT_REGULAR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the the '<em>Component Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_FEATURE_COUNT = COMPONENT_REGULAR_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link urncore.impl.DynamicResponsibilityImpl <em>Dynamic Responsibility</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.DynamicResponsibilityImpl
     * @see urncore.impl.UrncorePackageImpl#getDynamicResponsibility()
     * @generated
     */
	int DYNAMIC_RESPONSIBILITY = 7;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__URN_LINKS = RESPONSIBILITY__URN_LINKS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__ID = RESPONSIBILITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__NAME = RESPONSIBILITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__DESCRIPTION = RESPONSIBILITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Empty</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__EMPTY = RESPONSIBILITY__EMPTY;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__URNDEFINITION = RESPONSIBILITY__URNDEFINITION;

    /**
     * The feature id for the '<em><b>Demands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__DEMANDS = RESPONSIBILITY__DEMANDS;

    /**
     * The feature id for the '<em><b>Resp Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__RESP_REFS = RESPONSIBILITY__RESP_REFS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__KIND = RESPONSIBILITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__TO_PATH = RESPONSIBILITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Arrow Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__ARROW_LENGTH = RESPONSIBILITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pool</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY__POOL = RESPONSIBILITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the the '<em>Dynamic Responsibility</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DYNAMIC_RESPONSIBILITY_FEATURE_COUNT = RESPONSIBILITY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link urncore.impl.GRLmodelElementImpl <em>GR Lmodel Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.GRLmodelElementImpl
     * @see urncore.impl.UrncorePackageImpl#getGRLmodelElement()
     * @generated
     */
	int GR_LMODEL_ELEMENT = 9;

    /**
     * The feature id for the '<em><b>Urn Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT__URN_LINKS = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT__NAME = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT__URNDEFINITION = 4;

    /**
     * The number of structural features of the the '<em>GR Lmodel Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GR_LMODEL_ELEMENT_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link urncore.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.LabelImpl
     * @see urncore.impl.UrncorePackageImpl#getLabel()
     * @generated
     */
	int LABEL = 11;

    /**
     * The feature id for the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LABEL__DELTA_X = 0;

    /**
     * The feature id for the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LABEL__DELTA_Y = 1;

    /**
     * The number of structural features of the the '<em>Label</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LABEL_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link urncore.impl.NodeLabelImpl <em>Node Label</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.NodeLabelImpl
     * @see urncore.impl.UrncorePackageImpl#getNodeLabel()
     * @generated
     */
	int NODE_LABEL = 10;

    /**
     * The feature id for the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_LABEL__DELTA_X = LABEL__DELTA_X;

    /**
     * The feature id for the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_LABEL__DELTA_Y = LABEL__DELTA_Y;

    /**
     * The feature id for the '<em><b>Path Node</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_LABEL__PATH_NODE = LABEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the the '<em>Node Label</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link urncore.impl.ComponentLabelImpl <em>Component Label</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ComponentLabelImpl
     * @see urncore.impl.UrncorePackageImpl#getComponentLabel()
     * @generated
     */
	int COMPONENT_LABEL = 12;

    /**
     * The feature id for the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_LABEL__DELTA_X = LABEL__DELTA_X;

    /**
     * The feature id for the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_LABEL__DELTA_Y = LABEL__DELTA_Y;

    /**
     * The feature id for the '<em><b>Comp Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_LABEL__COMP_REF = LABEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the the '<em>Component Label</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link urncore.impl.NewClassImpl <em>New Class</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.NewClassImpl
     * @see urncore.impl.UrncorePackageImpl#getNewClass()
     * @generated
     */
	int NEW_CLASS = 13;

    /**
     * The number of structural features of the the '<em>New Class</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NEW_CLASS_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link urncore.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.impl.ConditionImpl
     * @see urncore.impl.UrncorePackageImpl#getCondition()
     * @generated
     */
	int CONDITION = 14;

    /**
     * The feature id for the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__DELTA_X = LABEL__DELTA_X;

    /**
     * The feature id for the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__DELTA_Y = LABEL__DELTA_Y;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__LABEL = LABEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__EXPRESSION = LABEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__DESCRIPTION = LABEL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Start Point</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__START_POINT = LABEL_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>End Point</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__END_POINT = LABEL_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Plugin Binding</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__PLUGIN_BINDING = LABEL_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Node Connection</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__NODE_CONNECTION = LABEL_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION__VARIABLES = LABEL_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the the '<em>Condition</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITION_FEATURE_COUNT = LABEL_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link urncore.ComponentKind <em>Component Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.ComponentKind
     * @see urncore.impl.UrncorePackageImpl#getComponentKind()
     * @generated
     */
	int COMPONENT_KIND = 15;

    /**
     * The meta object id for the '{@link urncore.DynamicRespKind <em>Dynamic Resp Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see urncore.DynamicRespKind
     * @see urncore.impl.UrncorePackageImpl#getDynamicRespKind()
     * @generated
     */
	int DYNAMIC_RESP_KIND = 16;


    /**
     * Returns the meta object for class '{@link urncore.URNdefinition <em>UR Ndefinition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>UR Ndefinition</em>'.
     * @see urncore.URNdefinition
     * @generated
     */
	EClass getURNdefinition();

    /**
     * Returns the meta object for the container reference '{@link urncore.URNdefinition#getUrnspec <em>Urnspec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Urnspec</em>'.
     * @see urncore.URNdefinition#getUrnspec()
     * @see #getURNdefinition()
     * @generated
     */
	EReference getURNdefinition_Urnspec();

    /**
     * Returns the meta object for the containment reference list '{@link urncore.URNdefinition#getResponsibilities <em>Responsibilities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Responsibilities</em>'.
     * @see urncore.URNdefinition#getResponsibilities()
     * @see #getURNdefinition()
     * @generated
     */
	EReference getURNdefinition_Responsibilities();

    /**
     * Returns the meta object for the containment reference list '{@link urncore.URNdefinition#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see urncore.URNdefinition#getComponents()
     * @see #getURNdefinition()
     * @generated
     */
	EReference getURNdefinition_Components();

    /**
     * Returns the meta object for the containment reference list '{@link urncore.URNdefinition#getGRLelements <em>GR Lelements</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GR Lelements</em>'.
     * @see urncore.URNdefinition#getGRLelements()
     * @see #getURNdefinition()
     * @generated
     */
	EReference getURNdefinition_GRLelements();

    /**
     * Returns the meta object for class '{@link urncore.Responsibility <em>Responsibility</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Responsibility</em>'.
     * @see urncore.Responsibility
     * @generated
     */
	EClass getResponsibility();

    /**
     * Returns the meta object for the attribute '{@link urncore.Responsibility#isEmpty <em>Empty</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Empty</em>'.
     * @see urncore.Responsibility#isEmpty()
     * @see #getResponsibility()
     * @generated
     */
	EAttribute getResponsibility_Empty();

    /**
     * Returns the meta object for the container reference '{@link urncore.Responsibility#getUrndefinition <em>Urndefinition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Urndefinition</em>'.
     * @see urncore.Responsibility#getUrndefinition()
     * @see #getResponsibility()
     * @generated
     */
	EReference getResponsibility_Urndefinition();

    /**
     * Returns the meta object for the containment reference list '{@link urncore.Responsibility#getDemands <em>Demands</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Demands</em>'.
     * @see urncore.Responsibility#getDemands()
     * @see #getResponsibility()
     * @generated
     */
	EReference getResponsibility_Demands();

    /**
     * Returns the meta object for the reference list '{@link urncore.Responsibility#getRespRefs <em>Resp Refs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resp Refs</em>'.
     * @see urncore.Responsibility#getRespRefs()
     * @see #getResponsibility()
     * @generated
     */
	EReference getResponsibility_RespRefs();

    /**
     * Returns the meta object for class '{@link urncore.ComponentRegular <em>Component Regular</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Regular</em>'.
     * @see urncore.ComponentRegular
     * @generated
     */
	EClass getComponentRegular();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentRegular#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see urncore.ComponentRegular#getKind()
     * @see #getComponentRegular()
     * @generated
     */
	EAttribute getComponentRegular_Kind();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentRegular#isProtected <em>Protected</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protected</em>'.
     * @see urncore.ComponentRegular#isProtected()
     * @see #getComponentRegular()
     * @generated
     */
	EAttribute getComponentRegular_Protected();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentRegular#isSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Slot</em>'.
     * @see urncore.ComponentRegular#isSlot()
     * @see #getComponentRegular()
     * @generated
     */
	EAttribute getComponentRegular_Slot();

    /**
     * Returns the meta object for the reference list '{@link urncore.ComponentRegular#getIncludedComponent <em>Included Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Included Component</em>'.
     * @see urncore.ComponentRegular#getIncludedComponent()
     * @see #getComponentRegular()
     * @generated
     */
	EReference getComponentRegular_IncludedComponent();

    /**
     * Returns the meta object for the reference '{@link urncore.ComponentRegular#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Host</em>'.
     * @see urncore.ComponentRegular#getHost()
     * @see #getComponentRegular()
     * @generated
     */
	EReference getComponentRegular_Host();

    /**
     * Returns the meta object for class '{@link urncore.ComponentElement <em>Component Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Element</em>'.
     * @see urncore.ComponentElement
     * @generated
     */
	EClass getComponentElement();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentElement#getLineColor <em>Line Color</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Color</em>'.
     * @see urncore.ComponentElement#getLineColor()
     * @see #getComponentElement()
     * @generated
     */
	EAttribute getComponentElement_LineColor();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentElement#getFillColor <em>Fill Color</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fill Color</em>'.
     * @see urncore.ComponentElement#getFillColor()
     * @see #getComponentElement()
     * @generated
     */
	EAttribute getComponentElement_FillColor();

    /**
     * Returns the meta object for the attribute '{@link urncore.ComponentElement#isFilled <em>Filled</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filled</em>'.
     * @see urncore.ComponentElement#isFilled()
     * @see #getComponentElement()
     * @generated
     */
	EAttribute getComponentElement_Filled();

    /**
     * Returns the meta object for the container reference '{@link urncore.ComponentElement#getUrndefinition <em>Urndefinition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Urndefinition</em>'.
     * @see urncore.ComponentElement#getUrndefinition()
     * @see #getComponentElement()
     * @generated
     */
	EReference getComponentElement_Urndefinition();

    /**
     * Returns the meta object for the reference '{@link urncore.ComponentElement#getIncludingComponent <em>Including Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Including Component</em>'.
     * @see urncore.ComponentElement#getIncludingComponent()
     * @see #getComponentElement()
     * @generated
     */
	EReference getComponentElement_IncludingComponent();

    /**
     * Returns the meta object for the reference '{@link urncore.ComponentElement#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resource</em>'.
     * @see urncore.ComponentElement#getResource()
     * @see #getComponentElement()
     * @generated
     */
	EReference getComponentElement_Resource();

    /**
     * Returns the meta object for the reference list '{@link urncore.ComponentElement#getCompRefs <em>Comp Refs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Comp Refs</em>'.
     * @see urncore.ComponentElement#getCompRefs()
     * @see #getComponentElement()
     * @generated
     */
	EReference getComponentElement_CompRefs();

    /**
     * Returns the meta object for class '{@link urncore.Pool <em>Pool</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pool</em>'.
     * @see urncore.Pool
     * @generated
     */
	EClass getPool();

    /**
     * Returns the meta object for the attribute '{@link urncore.Pool#isOfComponents <em>Of Components</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Of Components</em>'.
     * @see urncore.Pool#isOfComponents()
     * @see #getPool()
     * @generated
     */
	EAttribute getPool_OfComponents();

    /**
     * Returns the meta object for the attribute '{@link urncore.Pool#getContent <em>Content</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Content</em>'.
     * @see urncore.Pool#getContent()
     * @see #getPool()
     * @generated
     */
	EAttribute getPool_Content();

    /**
     * Returns the meta object for the reference '{@link urncore.Pool#getComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Component Type</em>'.
     * @see urncore.Pool#getComponentType()
     * @see #getPool()
     * @generated
     */
	EReference getPool_ComponentType();

    /**
     * Returns the meta object for the reference list '{@link urncore.Pool#getDynResponsibilities <em>Dyn Responsibilities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dyn Responsibilities</em>'.
     * @see urncore.Pool#getDynResponsibilities()
     * @see #getPool()
     * @generated
     */
	EReference getPool_DynResponsibilities();

    /**
     * Returns the meta object for class '{@link urncore.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see urncore.Component
     * @generated
     */
	EClass getComponent();

    /**
     * Returns the meta object for the reference '{@link urncore.Component#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see urncore.Component#getType()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_Type();

    /**
     * Returns the meta object for class '{@link urncore.ComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Type</em>'.
     * @see urncore.ComponentType
     * @generated
     */
	EClass getComponentType();

    /**
     * Returns the meta object for the reference list '{@link urncore.ComponentType#getSubType <em>Sub Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Type</em>'.
     * @see urncore.ComponentType#getSubType()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_SubType();

    /**
     * Returns the meta object for the reference '{@link urncore.ComponentType#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Type</em>'.
     * @see urncore.ComponentType#getSuperType()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_SuperType();

    /**
     * Returns the meta object for the reference list '{@link urncore.ComponentType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see urncore.ComponentType#getInstances()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_Instances();

    /**
     * Returns the meta object for the reference list '{@link urncore.ComponentType#getPools <em>Pools</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Pools</em>'.
     * @see urncore.ComponentType#getPools()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_Pools();

    /**
     * Returns the meta object for class '{@link urncore.DynamicResponsibility <em>Dynamic Responsibility</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dynamic Responsibility</em>'.
     * @see urncore.DynamicResponsibility
     * @generated
     */
	EClass getDynamicResponsibility();

    /**
     * Returns the meta object for the attribute '{@link urncore.DynamicResponsibility#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see urncore.DynamicResponsibility#getKind()
     * @see #getDynamicResponsibility()
     * @generated
     */
	EAttribute getDynamicResponsibility_Kind();

    /**
     * Returns the meta object for the attribute '{@link urncore.DynamicResponsibility#isToPath <em>To Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To Path</em>'.
     * @see urncore.DynamicResponsibility#isToPath()
     * @see #getDynamicResponsibility()
     * @generated
     */
	EAttribute getDynamicResponsibility_ToPath();

    /**
     * Returns the meta object for the attribute '{@link urncore.DynamicResponsibility#getArrowLength <em>Arrow Length</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Arrow Length</em>'.
     * @see urncore.DynamicResponsibility#getArrowLength()
     * @see #getDynamicResponsibility()
     * @generated
     */
	EAttribute getDynamicResponsibility_ArrowLength();

    /**
     * Returns the meta object for the reference '{@link urncore.DynamicResponsibility#getPool <em>Pool</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pool</em>'.
     * @see urncore.DynamicResponsibility#getPool()
     * @see #getDynamicResponsibility()
     * @generated
     */
	EReference getDynamicResponsibility_Pool();

    /**
     * Returns the meta object for class '{@link urncore.UCMmodelElement <em>UC Mmodel Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>UC Mmodel Element</em>'.
     * @see urncore.UCMmodelElement
     * @generated
     */
	EClass getUCMmodelElement();

    /**
     * Returns the meta object for the reference list '{@link urncore.UCMmodelElement#getUrnLinks <em>Urn Links</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Urn Links</em>'.
     * @see urncore.UCMmodelElement#getUrnLinks()
     * @see #getUCMmodelElement()
     * @generated
     */
	EReference getUCMmodelElement_UrnLinks();

    /**
     * Returns the meta object for the attribute '{@link urncore.UCMmodelElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see urncore.UCMmodelElement#getId()
     * @see #getUCMmodelElement()
     * @generated
     */
	EAttribute getUCMmodelElement_Id();

    /**
     * Returns the meta object for the attribute '{@link urncore.UCMmodelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see urncore.UCMmodelElement#getName()
     * @see #getUCMmodelElement()
     * @generated
     */
	EAttribute getUCMmodelElement_Name();

    /**
     * Returns the meta object for the attribute '{@link urncore.UCMmodelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see urncore.UCMmodelElement#getDescription()
     * @see #getUCMmodelElement()
     * @generated
     */
	EAttribute getUCMmodelElement_Description();

    /**
     * Returns the meta object for class '{@link urncore.GRLmodelElement <em>GR Lmodel Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>GR Lmodel Element</em>'.
     * @see urncore.GRLmodelElement
     * @generated
     */
	EClass getGRLmodelElement();

    /**
     * Returns the meta object for the reference list '{@link urncore.GRLmodelElement#getUrnLinks <em>Urn Links</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Urn Links</em>'.
     * @see urncore.GRLmodelElement#getUrnLinks()
     * @see #getGRLmodelElement()
     * @generated
     */
	EReference getGRLmodelElement_UrnLinks();

    /**
     * Returns the meta object for the attribute '{@link urncore.GRLmodelElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see urncore.GRLmodelElement#getId()
     * @see #getGRLmodelElement()
     * @generated
     */
	EAttribute getGRLmodelElement_Id();

    /**
     * Returns the meta object for the attribute '{@link urncore.GRLmodelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see urncore.GRLmodelElement#getName()
     * @see #getGRLmodelElement()
     * @generated
     */
	EAttribute getGRLmodelElement_Name();

    /**
     * Returns the meta object for the attribute '{@link urncore.GRLmodelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see urncore.GRLmodelElement#getDescription()
     * @see #getGRLmodelElement()
     * @generated
     */
	EAttribute getGRLmodelElement_Description();

    /**
     * Returns the meta object for the container reference '{@link urncore.GRLmodelElement#getUrndefinition <em>Urndefinition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Urndefinition</em>'.
     * @see urncore.GRLmodelElement#getUrndefinition()
     * @see #getGRLmodelElement()
     * @generated
     */
	EReference getGRLmodelElement_Urndefinition();

    /**
     * Returns the meta object for class '{@link urncore.NodeLabel <em>Node Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Label</em>'.
     * @see urncore.NodeLabel
     * @generated
     */
	EClass getNodeLabel();

    /**
     * Returns the meta object for the container reference '{@link urncore.NodeLabel#getPathNode <em>Path Node</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Path Node</em>'.
     * @see urncore.NodeLabel#getPathNode()
     * @see #getNodeLabel()
     * @generated
     */
	EReference getNodeLabel_PathNode();

    /**
     * Returns the meta object for class '{@link urncore.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Label</em>'.
     * @see urncore.Label
     * @generated
     */
	EClass getLabel();

    /**
     * Returns the meta object for the attribute '{@link urncore.Label#getDeltaX <em>Delta X</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delta X</em>'.
     * @see urncore.Label#getDeltaX()
     * @see #getLabel()
     * @generated
     */
	EAttribute getLabel_DeltaX();

    /**
     * Returns the meta object for the attribute '{@link urncore.Label#getDeltaY <em>Delta Y</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delta Y</em>'.
     * @see urncore.Label#getDeltaY()
     * @see #getLabel()
     * @generated
     */
	EAttribute getLabel_DeltaY();

    /**
     * Returns the meta object for class '{@link urncore.ComponentLabel <em>Component Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Label</em>'.
     * @see urncore.ComponentLabel
     * @generated
     */
	EClass getComponentLabel();

    /**
     * Returns the meta object for the container reference '{@link urncore.ComponentLabel#getCompRef <em>Comp Ref</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Comp Ref</em>'.
     * @see urncore.ComponentLabel#getCompRef()
     * @see #getComponentLabel()
     * @generated
     */
	EReference getComponentLabel_CompRef();

    /**
     * Returns the meta object for class '{@link urncore.NewClass <em>New Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>New Class</em>'.
     * @see urncore.NewClass
     * @generated
     */
	EClass getNewClass();

    /**
     * Returns the meta object for class '{@link urncore.Condition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Condition</em>'.
     * @see urncore.Condition
     * @generated
     */
	EClass getCondition();

    /**
     * Returns the meta object for the attribute '{@link urncore.Condition#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see urncore.Condition#getLabel()
     * @see #getCondition()
     * @generated
     */
	EAttribute getCondition_Label();

    /**
     * Returns the meta object for the attribute '{@link urncore.Condition#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see urncore.Condition#getExpression()
     * @see #getCondition()
     * @generated
     */
	EAttribute getCondition_Expression();

    /**
     * Returns the meta object for the attribute '{@link urncore.Condition#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see urncore.Condition#getDescription()
     * @see #getCondition()
     * @generated
     */
	EAttribute getCondition_Description();

    /**
     * Returns the meta object for the container reference '{@link urncore.Condition#getStartPoint <em>Start Point</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Start Point</em>'.
     * @see urncore.Condition#getStartPoint()
     * @see #getCondition()
     * @generated
     */
	EReference getCondition_StartPoint();

    /**
     * Returns the meta object for the container reference '{@link urncore.Condition#getEndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>End Point</em>'.
     * @see urncore.Condition#getEndPoint()
     * @see #getCondition()
     * @generated
     */
	EReference getCondition_EndPoint();

    /**
     * Returns the meta object for the container reference '{@link urncore.Condition#getPluginBinding <em>Plugin Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Plugin Binding</em>'.
     * @see urncore.Condition#getPluginBinding()
     * @see #getCondition()
     * @generated
     */
	EReference getCondition_PluginBinding();

    /**
     * Returns the meta object for the container reference '{@link urncore.Condition#getNodeConnection <em>Node Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Node Connection</em>'.
     * @see urncore.Condition#getNodeConnection()
     * @see #getCondition()
     * @generated
     */
	EReference getCondition_NodeConnection();

    /**
     * Returns the meta object for the reference list '{@link urncore.Condition#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see urncore.Condition#getVariables()
     * @see #getCondition()
     * @generated
     */
	EReference getCondition_Variables();

    /**
     * Returns the meta object for enum '{@link urncore.ComponentKind <em>Component Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Component Kind</em>'.
     * @see urncore.ComponentKind
     * @generated
     */
	EEnum getComponentKind();

    /**
     * Returns the meta object for enum '{@link urncore.DynamicRespKind <em>Dynamic Resp Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Dynamic Resp Kind</em>'.
     * @see urncore.DynamicRespKind
     * @generated
     */
	EEnum getDynamicRespKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	UrncoreFactory getUrncoreFactory();

} //UrncorePackage
