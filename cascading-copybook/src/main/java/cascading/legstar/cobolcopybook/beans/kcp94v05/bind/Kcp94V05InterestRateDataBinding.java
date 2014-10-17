package cascading.legstar.cobolcopybook.beans.kcp94v05.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.kcp94v05.Kcp94V05InterestRateData;
import cascading.legstar.cobolcopybook.beans.kcp94v05.Kcp94V05TierRateData;
import cascading.legstar.cobolcopybook.beans.kcp94v05.ObjectFactory;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp94V05InterestRateData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp94V05InterestRateDataBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 822;
  /** Static reference to Value object factory to be used as default. */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /** Child bound to value object property Kcp94V05TierRateData(Kcp94V05TierRateData). */
  public ICobolArrayComplexBinding _kcp94V05TierRateDataWrapper;
  /** Binding item for complex array binding Kcp94V05TierRateData. */
  public ICobolComplexBinding _kcp94V05TierRateDataWrapperItem;
  /** Value object to which this cobol complex element is bound. */
  private Kcp94V05InterestRateData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp94V05InterestRateDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp94V05InterestRateDataBinding(
    final Kcp94V05InterestRateData valueObject )
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
  public Kcp94V05InterestRateDataBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final Kcp94V05InterestRateData valueObject )
    {

    super( bindingName, fieldName, Kcp94V05InterestRateData.class, null, parentBinding );
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

    _kcp94V05TierRateDataWrapperItem = new Kcp94V05TierRateDataBinding( "Kcp94V05TierRateDataWrapperItem",
      "Kcp94V05TierRateData", this, null );
    _kcp94V05TierRateDataWrapper = new Kcp94V05TierRateDataWrapperBinding( "Kcp94V05TierRateDataWrapper",
      "Kcp94V05TierRateData", this, _kcp94V05TierRateDataWrapperItem );
    _kcp94V05TierRateDataWrapper.setCobolName( "KCP94V05-TIER-RATE-DATA" );
    _kcp94V05TierRateDataWrapper.setByteLength( 822 );
    _kcp94V05TierRateDataWrapper.setItemByteLength( 137 );
    _kcp94V05TierRateDataWrapper.setMinOccurs( 6 );
    _kcp94V05TierRateDataWrapper.setMaxOccurs( 6 );

        /* Add children to children list */
    getChildrenList().add( _kcp94V05TierRateDataWrapper );

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
    mValueObject = mValueObjectFactory.createKcp94V05InterestRateData();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp94V05TierRateDataWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp94V05TierRateDataWrapper"
        + " value=" + mValueObject.getKcp94V05TierRateData() );
      }
    _kcp94V05TierRateDataWrapper.setObjectValue( mValueObject.getKcp94V05TierRateData() );
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
        bindingValue = child.getObjectValue( Kcp94V05TierRateData.class );
        List<Kcp94V05TierRateData> listKcp94V05TierRateDataWrapper = cast( bindingValue );
        mValueObject.getKcp94V05TierRateData().clear();
        mValueObject.getKcp94V05TierRateData().addAll( listKcp94V05TierRateDataWrapper );
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
    if( type.equals( Kcp94V05InterestRateData.class ) )
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
    if( bindingValue.getClass().equals( Kcp94V05InterestRateData.class ) )
      {
      mValueObject = (Kcp94V05InterestRateData) bindingValue;
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
  public Kcp94V05InterestRateData getKcp94V05InterestRateData()
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

