package cascading.legstar.cobolcopybook.beans.kcp07v05.bind;

import java.math.BigDecimal;

import cascading.legstar.cobolcopybook.beans.kcp07v05.Kcp07V05BalTab;
import cascading.legstar.cobolcopybook.beans.kcp07v05.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp07V05BalTab.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp07V05BalTabBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 10;
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
  /** Child bound to value object property Kcp07V05BalIdent(Short). */
  public ICobolPackedDecimalBinding _kcp07V05BalIdent;
  /** Child bound to value object property Kcp07V05Bal(BigDecimal). */
  public ICobolPackedDecimalBinding _kcp07V05Bal;
  /** Value object to which this cobol complex element is bound. */
  private Kcp07V05BalTab mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp07V05BalTabBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp07V05BalTabBinding(
    final Kcp07V05BalTab valueObject )
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
  public Kcp07V05BalTabBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final Kcp07V05BalTab valueObject )
    {

    super( bindingName, fieldName, Kcp07V05BalTab.class, null, parentBinding );
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

    _kcp07V05BalIdent = BF.createPackedDecimalBinding( "Kcp07V05BalIdent",
      "Kcp07V05BalIdent", Short.class, this );
    _kcp07V05BalIdent.setCobolName( "KCP07V05-BAL-IDENT" );
    _kcp07V05BalIdent.setByteLength( 2 );
    _kcp07V05BalIdent.setTotalDigits( 3 );
    _kcp07V05BalIdent.setIsSigned( true );
    _kcp07V05Bal = BF.createPackedDecimalBinding( "Kcp07V05Bal",
      "Kcp07V05Bal", BigDecimal.class, this );
    _kcp07V05Bal.setCobolName( "KCP07V05-BAL" );
    _kcp07V05Bal.setByteLength( 8 );
    _kcp07V05Bal.setTotalDigits( 15 );
    _kcp07V05Bal.setFractionDigits( 2 );
    _kcp07V05Bal.setIsSigned( true );

        /* Add children to children list */
    getChildrenList().add( _kcp07V05BalIdent );
    getChildrenList().add( _kcp07V05Bal );

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
    mValueObject = mValueObjectFactory.createKcp07V05BalTab();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp07V05BalIdent */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp07V05BalIdent"
        + " value=" + mValueObject.getKcp07V05BalIdent() );
      }
    _kcp07V05BalIdent.setObjectValue( mValueObject.getKcp07V05BalIdent() );
        /* Get Value object property _kcp07V05Bal */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp07V05Bal"
        + " value=" + mValueObject.getKcp07V05Bal() );
      }
    _kcp07V05Bal.setObjectValue( mValueObject.getKcp07V05Bal() );
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
        mValueObject.setKcp07V05BalIdent( (Short) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( BigDecimal.class );
        mValueObject.setKcp07V05Bal( (BigDecimal) bindingValue );
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
    if( type.equals( Kcp07V05BalTab.class ) )
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
    if( bindingValue.getClass().equals( Kcp07V05BalTab.class ) )
      {
      mValueObject = (Kcp07V05BalTab) bindingValue;
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
  public Kcp07V05BalTab getKcp07V05BalTab()
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

