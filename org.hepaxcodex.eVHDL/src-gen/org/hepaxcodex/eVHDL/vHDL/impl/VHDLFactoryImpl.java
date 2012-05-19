/**
 * <copyright>
 * </copyright>
 *
 */
package org.hepaxcodex.eVHDL.vHDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hepaxcodex.eVHDL.vHDL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLFactoryImpl extends EFactoryImpl implements VHDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VHDLFactory init()
  {
    try
    {
      VHDLFactory theVHDLFactory = (VHDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.hepaxcodex.org/eVHDL/VHDL"); 
      if (theVHDLFactory != null)
      {
        return theVHDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VHDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VHDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VHDLPackage.VHDL_PAGCKAGE: return createvHDLPagckage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vHDLPagckage createvHDLPagckage()
  {
    vHDLPagckageImpl vHDLPagckage = new vHDLPagckageImpl();
    return vHDLPagckage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VHDLPackage getVHDLPackage()
  {
    return (VHDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VHDLPackage getPackage()
  {
    return VHDLPackage.eINSTANCE;
  }

} //VHDLFactoryImpl
