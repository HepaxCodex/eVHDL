/**
 * <copyright>
 * </copyright>
 *
 */
package org.hepaxcodex.eVHDL.vHDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.hepaxcodex.eVHDL.vHDL.VHDLFactory
 * @model kind="package"
 * @generated
 */
public interface VHDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vHDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hepaxcodex.org/eVHDL/VHDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vHDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VHDLPackage eINSTANCE = org.hepaxcodex.eVHDL.vHDL.impl.VHDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.hepaxcodex.eVHDL.vHDL.impl.vHDLPagckageImpl <em>vHDL Pagckage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.hepaxcodex.eVHDL.vHDL.impl.vHDLPagckageImpl
   * @see org.hepaxcodex.eVHDL.vHDL.impl.VHDLPackageImpl#getvHDLPagckage()
   * @generated
   */
  int VHDL_PAGCKAGE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VHDL_PAGCKAGE__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>vHDL Pagckage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VHDL_PAGCKAGE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.hepaxcodex.eVHDL.vHDL.vHDLPagckage <em>vHDL Pagckage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vHDL Pagckage</em>'.
   * @see org.hepaxcodex.eVHDL.vHDL.vHDLPagckage
   * @generated
   */
  EClass getvHDLPagckage();

  /**
   * Returns the meta object for the attribute list '{@link org.hepaxcodex.eVHDL.vHDL.vHDLPagckage#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see org.hepaxcodex.eVHDL.vHDL.vHDLPagckage#getElements()
   * @see #getvHDLPagckage()
   * @generated
   */
  EAttribute getvHDLPagckage_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VHDLFactory getVHDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.hepaxcodex.eVHDL.vHDL.impl.vHDLPagckageImpl <em>vHDL Pagckage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hepaxcodex.eVHDL.vHDL.impl.vHDLPagckageImpl
     * @see org.hepaxcodex.eVHDL.vHDL.impl.VHDLPackageImpl#getvHDLPagckage()
     * @generated
     */
    EClass VHDL_PAGCKAGE = eINSTANCE.getvHDLPagckage();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VHDL_PAGCKAGE__ELEMENTS = eINSTANCE.getvHDLPagckage_Elements();

  }

} //VHDLPackage
