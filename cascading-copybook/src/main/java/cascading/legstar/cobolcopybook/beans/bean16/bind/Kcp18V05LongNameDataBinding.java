package cascading.legstar.cobolcopybook.beans.bean16.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean16.Kcp18V05LnameData;
import cascading.legstar.cobolcopybook.beans.bean16.Kcp18V05LongNameData;
import cascading.legstar.cobolcopybook.beans.bean16.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp18V05LongNameData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp18V05LongNameDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 1782;
  /**
   * Binding factory.
   */
  private static final ICobolBindingFactory BF = CobolBindingFactory.getBindingFactory();
  /**
   * Static reference to Value object factory to be used as default.
   */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /**
   * Logger.
   */
  private final Log _log = LogFactory.getLog( getClass() );
  /**
   * Child bound to value object property Kcp18V05NoOfLongNames(Integer).
   */
  public ICobolZonedDecimalBinding _kcp18V05NoOfLongNames;
  /**
   * Child bound to value object property Kcp18V05LnameData(Kcp18V05LnameData).
   */
  public ICobolArrayComplexBinding _kcp18V05LnameDataWrapper;
  /**
   * Binding item for complex array binding Kcp18V05LnameData.
   */
  public ICobolComplexBinding _kcp18V05LnameDataWrapperItem;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp18V05LongNameData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp18V05LongNameDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp18V05LongNameDataBinding( final Kcp18V05LongNameData valueObject )
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
  public Kcp18V05LongNameDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp18V05LongNameData valueObject )
    {

    super( bindingName, fieldName, Kcp18V05LongNameData.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /**
   * Creates a binding property for each child.
   */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _kcp18V05NoOfLongNames = BF.createZonedDecimalBinding( "Kcp18V05NoOfLongNames", "Kcp18V05NoOfLongNames", Integer.class, this );
    _kcp18V05NoOfLongNames.setCobolName( "KCP18V05-NO-OF-LONG-NAMES" );
    _kcp18V05NoOfLongNames.setByteLength( 2 );
    _kcp18V05NoOfLongNames.setTotalDigits( 2 );
    _kcp18V05NoOfLongNames.setIsODOObject( true );
    _kcp18V05LnameDataWrapperItem = new Kcp18V05LnameDataBinding( "Kcp18V05LnameDataWrapperItem", "Kcp18V05LnameData", this, null );
    _kcp18V05LnameDataWrapper = new Kcp18V05LnameDataWrapperBinding( "Kcp18V05LnameDataWrapper", "Kcp18V05LnameData", this, _kcp18V05LnameDataWrapperItem );
    _kcp18V05LnameDataWrapper.setCobolName( "KCP18V05-LNAME-DATA" );
    _kcp18V05LnameDataWrapper.setByteLength( 1780 );
    _kcp18V05LnameDataWrapper.setItemByteLength( 178 );
    _kcp18V05LnameDataWrapper.setMaxOccurs( 10 );
    _kcp18V05LnameDataWrapper.setDependingOn( "KCP18V05-NO-OF-LONG-NAMES" );

        /* Add children to children list */
    getChildrenList().add( _kcp18V05NoOfLongNames );
    getChildrenList().add( _kcp18V05LnameDataWrapper );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /**
   * {@inheritDoc}
   */
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
    mValueObject = mValueObjectFactory.createKcp18V05LongNameData();
    }

  /**
   * {@inheritDoc}
   */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp18V05NoOfLongNames */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp18V05NoOfLongNames" + " value=" + mValueObject.getKcp18V05NoOfLongNames() );
      }
    _kcp18V05NoOfLongNames.setObjectValue( mValueObject.getKcp18V05NoOfLongNames() );
        /* Get Value object property _kcp18V05LnameDataWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp18V05LnameDataWrapper" + " value=" + mValueObject.getKcp18V05LnameData() );
      }
    _kcp18V05LnameDataWrapper.setObjectValue( mValueObject.getKcp18V05LnameData() );
        /* For variable size array or list, we make sure any
         * associated counter is updated */
    setCounterValue( _kcp18V05LnameDataWrapper.getDependingOn(), ( (List<?>) mValueObject.getKcp18V05LnameData() ).size() );
    }

  /**
   * {@inheritDoc}
   */
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
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp18V05NoOfLongNames( (Integer) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Kcp18V05LnameData.class );
        List<Kcp18V05LnameData> listKcp18V05LnameDataWrapper = cast( bindingValue );
        mValueObject.getKcp18V05LnameData().clear();
        mValueObject.getKcp18V05LnameData().addAll( listKcp18V05LnameDataWrapper );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property " + child.getJaxbName() + " value=" + bindingValue );
      }
    }

  /**
   * {@inheritDoc}
   */
  public Object getObjectValue( final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp18V05LongNameData.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName() + " as an incompatible type " + type );
      }
    }

  /**
   * {@inheritDoc}
   */
  public void setObjectValue( final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( Kcp18V05LongNameData.class ) )
      {
      mValueObject = (Kcp18V05LongNameData) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName() + " from an incompatible value " + bindingValue );
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

  /**
   * {@inheritDoc}
   */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public Kcp18V05LongNameData getKcp18V05LongNameData()
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

