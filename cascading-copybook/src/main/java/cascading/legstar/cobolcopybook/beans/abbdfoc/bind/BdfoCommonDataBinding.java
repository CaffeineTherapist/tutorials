package cascading.legstar.cobolcopybook.beans.abbdfoc.bind;

import cascading.legstar.cobolcopybook.beans.abbdfoc.BdfoCommonData;
import cascading.legstar.cobolcopybook.beans.abbdfoc.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinaryBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * BdfoCommonData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class BdfoCommonDataBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 12;
  /** Binding factory. */
  private static final ICobolBindingFactory BF
    = CobolBindingFactory.getBindingFactory();
  /** Static reference to Value object factory to be used as default. */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /** Child bound to value object property BdfoLen(Short). */
  public ICobolBinaryBinding _bdfoLen;
  /** Child bound to value object property BdfoKey(Long). */
  public ICobolPackedDecimalBinding _bdfoKey;
  /** Child bound to value object property BdfoParmNo(Integer). */
  public ICobolZonedDecimalBinding _bdfoParmNo;
  /** Value object to which this cobol complex element is bound. */
  private BdfoCommonData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public BdfoCommonDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public BdfoCommonDataBinding(
    final BdfoCommonData valueObject )
    {
    this( "", "", null, valueObject );
    }

  /**
   * Constructor for a Complex element as a child of another element and
   * an associated Value object.
   *
   * @param bindingName   the identifier for this binding
   * @param fieldName     field name in parent Value object
   * @param valueObject   the concrete Value object instance bound to this
   *                      complex element
   * @param parentBinding a reference to the parent binding
   */
  public BdfoCommonDataBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final BdfoCommonData valueObject )
    {

    super( bindingName, fieldName, BdfoCommonData.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /** Creates a binding property for each child. */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _bdfoLen = BF.createBinaryBinding( "BdfoLen",
      "BdfoLen", Short.class, this );
    _bdfoLen.setCobolName( "BDFO-LEN" );
    _bdfoLen.setByteLength( 2 );
    _bdfoLen.setTotalDigits( 4 );
    _bdfoLen.setIsSigned( true );
    _bdfoKey = BF.createPackedDecimalBinding( "BdfoKey",
      "BdfoKey", Long.class, this );
    _bdfoKey.setCobolName( "BDFO-KEY" );
    _bdfoKey.setByteLength( 7 );
    _bdfoKey.setTotalDigits( 13 );
    _bdfoKey.setIsSigned( true );
    _bdfoParmNo = BF.createZonedDecimalBinding( "BdfoParmNo",
      "BdfoParmNo", Integer.class, this );
    _bdfoParmNo.setCobolName( "BDFO-PARM-NO" );
    _bdfoParmNo.setByteLength( 3 );
    _bdfoParmNo.setTotalDigits( 3 );

        /* Add children to children list */
    getChildrenList().add( _bdfoLen );
    getChildrenList().add( _bdfoKey );
    getChildrenList().add( _bdfoParmNo );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /** {@inheritDoc} */
  public void createValueObject() throws HostException
    {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
    if( mUnusedValueObject && mValueObject != null )
      {
      mUnusedValueObject = false;
      return;
      }
    mValueObject = mValueObjectFactory.createBdfoCommonData();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _bdfoLen */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoLen"
        + " value=" + mValueObject.getBdfoLen() );
      }
    _bdfoLen.setObjectValue( mValueObject.getBdfoLen() );
        /* Get Value object property _bdfoKey */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoKey"
        + " value=" + mValueObject.getBdfoKey() );
      }
    _bdfoKey.setObjectValue( mValueObject.getBdfoKey() );
        /* Get Value object property _bdfoParmNo */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoParmNo"
        + " value=" + mValueObject.getBdfoParmNo() );
      }
    _bdfoParmNo.setObjectValue( mValueObject.getBdfoParmNo() );
    }

  /** {@inheritDoc} */
  public void setPropertyValue( final int index ) throws HostException
    {

    ICobolBinding child = getChildrenList().get( index );

       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
    if( !child.isBound() )
      {
      return;
      }

        /* Set the Value object property value from binding object */
    Object bindingValue = null;
    switch( index )
      {
      case 0:
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setBdfoLen( (Short) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Long.class );
        mValueObject.setBdfoKey( (Long) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setBdfoParmNo( (Integer) bindingValue );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property "
        + child.getJaxbName()
        + " value=" + bindingValue );
      }
    }

  /** {@inheritDoc} */
  public Object getObjectValue(
    final Class<?> type ) throws HostException
    {
    if( type.equals( BdfoCommonData.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName()
        + " as an incompatible type " + type );
      }
    }

  /** {@inheritDoc} */
  public void setObjectValue(
    final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( BdfoCommonData.class ) )
      {
      mValueObject = (BdfoCommonData) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName()
        + " from an incompatible value " + bindingValue );
      }
    }

  /**
   * @return the java object factory for objects creation
   */
  public ObjectFactory getObjectFactory()
    {
    return mValueObjectFactory;
    }

  /**
   * @param valueObjectFactory the java object factory for objects creation
   */
  public void setObjectFactory( final Object valueObjectFactory )
    {
    mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

  /** {@inheritDoc} */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public BdfoCommonData getBdfoCommonData()
    {
    return mValueObject;
    }

  /**
   * The COBOL complex element maximum length in bytes.
   *
   * @return COBOL complex element maximum length in bytes
   */
  public int getByteLength()
    {
    return BYTE_LENGTH;
    }
  }

