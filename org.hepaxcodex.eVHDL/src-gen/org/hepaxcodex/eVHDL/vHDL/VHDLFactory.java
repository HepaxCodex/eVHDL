/**
 * <copyright>
 * </copyright>
 *
 */
package org.hepaxcodex.eVHDL.vHDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hepaxcodex.eVHDL.vHDL.VHDLPackage
 * @generated
 */
public interface VHDLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VHDLFactory eINSTANCE = org.hepaxcodex.eVHDL.vHDL.impl.VHDLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>vHDL Pagckage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vHDL Pagckage</em>'.
   * @generated
   */
  vHDLPagckage createvHDLPagckage();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VHDLPackage getVHDLPackage();

} //VHDLFactory
