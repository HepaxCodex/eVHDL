/**
 * <copyright>
 * </copyright>
 *
 */
package org.hepaxcodex.eVHDL.vHDL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hepaxcodex.eVHDL.vHDL.VHDLFactory;
import org.hepaxcodex.eVHDL.vHDL.VHDLPackage;
import org.hepaxcodex.eVHDL.vHDL.vHDLPagckage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLPackageImpl extends EPackageImpl implements VHDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vHDLPagckageEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.hepaxcodex.eVHDL.vHDL.VHDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VHDLPackageImpl()
  {
    super(eNS_URI, VHDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VHDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VHDLPackage init()
  {
    if (isInited) return (VHDLPackage)EPackage.Registry.INSTANCE.getEPackage(VHDLPackage.eNS_URI);

    // Obtain or create and register package
    VHDLPackageImpl theVHDLPackage = (VHDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VHDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VHDLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVHDLPackage.createPackageContents();

    // Initialize created meta-data
    theVHDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVHDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VHDLPackage.eNS_URI, theVHDLPackage);
    return theVHDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvHDLPagckage()
  {
    return vHDLPagckageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvHDLPagckage_Elements()
  {
    return (EAttribute)vHDLPagckageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VHDLFactory getVHDLFactory()
  {
    return (VHDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    vHDLPagckageEClass = createEClass(VHDL_PAGCKAGE);
    createEAttribute(vHDLPagckageEClass, VHDL_PAGCKAGE__ELEMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(vHDLPagckageEClass, vHDLPagckage.class, "vHDLPagckage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvHDLPagckage_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, vHDLPagckage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VHDLPackageImpl
