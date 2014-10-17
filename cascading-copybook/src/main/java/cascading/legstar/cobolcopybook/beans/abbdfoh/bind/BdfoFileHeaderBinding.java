package cascading.legstar.cobolcopybook.beans.abbdfoh.bind;

import cascading.legstar.cobolcopybook.beans.abbdfoh.BdfoFileHeader;
import cascading.legstar.cobolcopybook.beans.abbdfoh.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * BdfoFileHeader.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class BdfoFileHeaderBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 64;
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
  /** Child bound to value object property BdfoRundate(String). */
  public ICobolStringBinding _bdfoRundate;
  /** Child bound to value object property BdfoFileId(String). */
  public ICobolStringBinding _bdfoFileId;
  /** Child bound to value object property BdfoCentreId(String). */
  public ICobolStringBinding _bdfoCentreId;
  /** Child bound to value object property BdfoSbiFileInd(String). */
  public ICobolStringBinding _bdfoSbiFileInd;
  /** Child bound to value object property BdfoDenReturned(String). */
  public ICobolStringBinding _bdfoDenReturned;
  /** Value object to which this cobol complex element is bound. */
  private BdfoFileHeader mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public BdfoFileHeaderBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public BdfoFileHeaderBinding(
    final BdfoFileHeader valueObject )
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
  public BdfoFileHeaderBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final BdfoFileHeader valueObject )
    {

    super( bindingName, fieldName, BdfoFileHeader.class, null, parentBinding );
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

    _bdfoRundate = BF.createStringBinding( "BdfoRundate",
      "BdfoRundate", String.class, this );
    _bdfoRundate.setCobolName( "BDFO-RUNDATE" );
    _bdfoRundate.setByteLength( 2 );
    _bdfoFileId = BF.createStringBinding( "BdfoFileId",
      "BdfoFileId", String.class, this );
    _bdfoFileId.setCobolName( "BDFO-FILE-ID" );
    _bdfoFileId.setByteLength( 8 );
    _bdfoCentreId = BF.createStringBinding( "BdfoCentreId",
      "BdfoCentreId", String.class, this );
    _bdfoCentreId.setCobolName( "BDFO-CENTRE-ID" );
    _bdfoCentreId.setByteLength( 1 );
    _bdfoSbiFileInd = BF.createStringBinding( "BdfoSbiFileInd",
      "BdfoSbiFileInd", String.class, this );
    _bdfoSbiFileInd.setCobolName( "BDFO-SBI-FILE-IND" );
    _bdfoSbiFileInd.setByteLength( 50 );
    _bdfoDenReturned = BF.createStringBinding( "BdfoDenReturned",
      "BdfoDenReturned", String.class, this );
    _bdfoDenReturned.setCobolName( "BDFO-DEN-RETURNED" );
    _bdfoDenReturned.setByteLength( 3 );

        /* Add children to children list */
    getChildrenList().add( _bdfoRundate );
    getChildrenList().add( _bdfoFileId );
    getChildrenList().add( _bdfoCentreId );
    getChildrenList().add( _bdfoSbiFileInd );
    getChildrenList().add( _bdfoDenReturned );

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
    mValueObject = mValueObjectFactory.createBdfoFileHeader();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _bdfoRundate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoRundate"
        + " value=" + mValueObject.getBdfoRundate() );
      }
    _bdfoRundate.setObjectValue( mValueObject.getBdfoRundate() );
        /* Get Value object property _bdfoFileId */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoFileId"
        + " value=" + mValueObject.getBdfoFileId() );
      }
    _bdfoFileId.setObjectValue( mValueObject.getBdfoFileId() );
        /* Get Value object property _bdfoCentreId */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoCentreId"
        + " value=" + mValueObject.getBdfoCentreId() );
      }
    _bdfoCentreId.setObjectValue( mValueObject.getBdfoCentreId() );
        /* Get Value object property _bdfoSbiFileInd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoSbiFileInd"
        + " value=" + mValueObject.getBdfoSbiFileInd() );
      }
    _bdfoSbiFileInd.setObjectValue( mValueObject.getBdfoSbiFileInd() );
        /* Get Value object property _bdfoDenReturned */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_bdfoDenReturned"
        + " value=" + mValueObject.getBdfoDenReturned() );
      }
    _bdfoDenReturned.setObjectValue( mValueObject.getBdfoDenReturned() );
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
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setBdfoRundate( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setBdfoFileId( (String) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setBdfoCentreId( (String) bindingValue );
        break;
      case 3:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setBdfoSbiFileInd( (String) bindingValue );
        break;
      case 4:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setBdfoDenReturned( (String) bindingValue );
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
    if( type.equals( BdfoFileHeader.class ) )
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
    if( bindingValue.getClass().equals( BdfoFileHeader.class ) )
      {
      mValueObject = (BdfoFileHeader) bindingValue;
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
  public BdfoFileHeader getBdfoFileHeader()
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

