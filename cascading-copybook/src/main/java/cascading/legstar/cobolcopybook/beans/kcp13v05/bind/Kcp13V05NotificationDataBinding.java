package cascading.legstar.cobolcopybook.beans.kcp13v05.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.kcp13v05.Kcp13V05NotificatDiaryData;
import cascading.legstar.cobolcopybook.beans.kcp13v05.Kcp13V05NotificationData;
import cascading.legstar.cobolcopybook.beans.kcp13v05.ObjectFactory;
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
 * Kcp13V05NotificationData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp13V05NotificationDataBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 637;
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
  /** Child bound to value object property Kcp13V05NoOfDiaries(Integer). */
  public ICobolZonedDecimalBinding _kcp13V05NoOfDiaries;
  /** Child bound to value object property Kcp13V05NotificatDiaryData(Kcp13V05NotificatDiaryData). */
  public ICobolArrayComplexBinding _kcp13V05NotificatDiaryDataWrapper;
  /** Binding item for complex array binding Kcp13V05NotificatDiaryData. */
  public ICobolComplexBinding _kcp13V05NotificatDiaryDataWrapperItem;
  /** Value object to which this cobol complex element is bound. */
  private Kcp13V05NotificationData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp13V05NotificationDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp13V05NotificationDataBinding(
    final Kcp13V05NotificationData valueObject )
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
  public Kcp13V05NotificationDataBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final Kcp13V05NotificationData valueObject )
    {

    super( bindingName, fieldName, Kcp13V05NotificationData.class, null, parentBinding );
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

    _kcp13V05NoOfDiaries = BF.createZonedDecimalBinding( "Kcp13V05NoOfDiaries",
      "Kcp13V05NoOfDiaries", Integer.class, this );
    _kcp13V05NoOfDiaries.setCobolName( "KCP13V05-NO-OF-DIARIES" );
    _kcp13V05NoOfDiaries.setByteLength( 1 );
    _kcp13V05NoOfDiaries.setTotalDigits( 1 );
    _kcp13V05NoOfDiaries.setIsODOObject( true );
    _kcp13V05NotificatDiaryDataWrapperItem = new Kcp13V05NotificatDiaryDataBinding( "Kcp13V05NotificatDiaryDataWrapperItem",
      "Kcp13V05NotificatDiaryData", this, null );
    _kcp13V05NotificatDiaryDataWrapper = new Kcp13V05NotificatDiaryDataWrapperBinding( "Kcp13V05NotificatDiaryDataWrapper",
      "Kcp13V05NotificatDiaryData", this, _kcp13V05NotificatDiaryDataWrapperItem );
    _kcp13V05NotificatDiaryDataWrapper.setCobolName( "KCP13V05-NOTIFICAT-DIARY-DATA" );
    _kcp13V05NotificatDiaryDataWrapper.setByteLength( 636 );
    _kcp13V05NotificatDiaryDataWrapper.setItemByteLength( 159 );
    _kcp13V05NotificatDiaryDataWrapper.setMinOccurs( 1 );
    _kcp13V05NotificatDiaryDataWrapper.setMaxOccurs( 4 );
    _kcp13V05NotificatDiaryDataWrapper.setDependingOn( "KCP13V05-NO-OF-DIARIES" );

        /* Add children to children list */
    getChildrenList().add( _kcp13V05NoOfDiaries );
    getChildrenList().add( _kcp13V05NotificatDiaryDataWrapper );

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
    mValueObject = mValueObjectFactory.createKcp13V05NotificationData();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp13V05NoOfDiaries */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp13V05NoOfDiaries"
        + " value=" + mValueObject.getKcp13V05NoOfDiaries() );
      }
    _kcp13V05NoOfDiaries.setObjectValue( mValueObject.getKcp13V05NoOfDiaries() );
        /* Get Value object property _kcp13V05NotificatDiaryDataWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp13V05NotificatDiaryDataWrapper"
        + " value=" + mValueObject.getKcp13V05NotificatDiaryData() );
      }
    _kcp13V05NotificatDiaryDataWrapper.setObjectValue( mValueObject.getKcp13V05NotificatDiaryData() );
        /* For variable size array or list, we make sure any
         * associated counter is updated */
    setCounterValue( _kcp13V05NotificatDiaryDataWrapper.getDependingOn(),
      ( (List<?>) mValueObject.getKcp13V05NotificatDiaryData() ).size() );
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
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp13V05NoOfDiaries( (Integer) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Kcp13V05NotificatDiaryData.class );
        List<Kcp13V05NotificatDiaryData> listKcp13V05NotificatDiaryDataWrapper = cast( bindingValue );
        mValueObject.getKcp13V05NotificatDiaryData().clear();
        mValueObject.getKcp13V05NotificatDiaryData().addAll( listKcp13V05NotificatDiaryDataWrapper );
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
    if( type.equals( Kcp13V05NotificationData.class ) )
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
    if( bindingValue.getClass().equals( Kcp13V05NotificationData.class ) )
      {
      mValueObject = (Kcp13V05NotificationData) bindingValue;
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
  public Kcp13V05NotificationData getKcp13V05NotificationData()
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

