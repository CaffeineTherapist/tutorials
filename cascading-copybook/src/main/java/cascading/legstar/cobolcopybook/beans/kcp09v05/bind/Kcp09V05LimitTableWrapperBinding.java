package cascading.legstar.cobolcopybook.beans.kcp09v05.bind;

import java.util.ArrayList;
import java.util.List;

import cascading.legstar.cobolcopybook.beans.kcp09v05.Kcp09V05LimitTable;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.common.CArrayComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex Array (Wrapper) element:
 * List < Kcp09V05LimitTable >.
 * <p/>
 * Represents an array of complex (record) elements. A complex array maps to
 * a cobol OCCURS of group items and to java Lists.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */

public class Kcp09V05LimitTableWrapperBinding
  extends CArrayComplexBinding
  {

  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /** Value object to which this cobol complex array element is bound. */
  private List<Kcp09V05LimitTable> mValueObject;

  /**
   * Constructor for an array of Complex elements.
   *
   * @param bindingName        the identifier for this binding
   * @param fieldName          name of field in parent value object
   * @param parentBinding      a reference to the parent binding
   * @param complexItemBinding a binding element for array items
   */
  public Kcp09V05LimitTableWrapperBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final ICobolComplexBinding complexItemBinding )
    {

    super( bindingName, fieldName, Kcp09V05LimitTable.class, null, parentBinding, complexItemBinding );
    setMinOccurs( -1 );
    setMaxOccurs( 10 );
    setDependingOn( "KCP09V05-NO-OF-LIMS" );
    }

  /** {@inheritDoc} */
  public void createValueObject() throws HostException
    {
    mValueObject = new ArrayList<Kcp09V05LimitTable>();
    }

  /** {@inheritDoc} */
  public void setItemValue(
    final int index ) throws HostException
    {
         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* The value object list might have less items than expected by the
         * binding. In this case, we fill the binding with empty items. */
    if( index < mValueObject.size() )
      {
      if( _log.isDebugEnabled() )
        {
        _log.debug( "Getting value from item " + index
          + " of Value object property "
          + "List < Kcp09V05LimitTable >"
          + " value=" + mValueObject.get( index ) );
        }
      getComplexItemBinding().setObjectValue( mValueObject.get( index ) );
      }
    else
      {
      if( _log.isDebugEnabled() )
        {
        _log.debug( "Initializing item " + index );
        }
      getComplexItemBinding().setObjectValue( null );
      }
    }

  /** {@inheritDoc} */
  public void addPropertyValue(
    final int index ) throws HostException
    {
         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      throw new HostException(
        "Binded object not initialized for " + getBindingName() );
      }
    mValueObject.add( (Kcp09V05LimitTable) getComplexItemBinding().
      getObjectValue( Kcp09V05LimitTable.class ) );
    }

  /** {@inheritDoc} */
  public List<?> getObjectList()
    {
    return mValueObject;
    }

  /** {@inheritDoc} */
  @SuppressWarnings("unchecked")
  public void setObjectList(
    final List<?> list )
    {
    mValueObject = (List<Kcp09V05LimitTable>) list;
    }

  /** {@inheritDoc} */
  public Object getObjectValue(
    final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp09V05LimitTable.class ) )
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
  @SuppressWarnings("unchecked")
  public void setObjectValue( final Object value ) throws HostException
    {
    if( value == null )
      {
      mValueObject = null;
      return;
      }
    if( value instanceof List )
      {
      if( ( (List<?>) value ).size() == 0 )
        {
        mValueObject = new ArrayList<Kcp09V05LimitTable>();
        return;
        }
            /* We assume all items will have the same type as the first one.
             * The unchecked cast might break at runtime. */
      Object item = ( (List<?>) value ).get( 0 );
      if( item.getClass().equals( Kcp09V05LimitTable.class ) )
        {
        mValueObject = (List<Kcp09V05LimitTable>) value;
        return;
        }
      }
    throw new HostException( "Attempt to set binding " + getBindingName()
      + " from an incompatible value " + value );
    }

  /** {@inheritDoc} */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound value object
   * @throws HostException if bound value object cannot be retrieved
   */
  @SuppressWarnings("unchecked")
  public List<Kcp09V05LimitTable> getKcp09V05LimitTable() throws HostException
    {
    return (List<Kcp09V05LimitTable>) getObjectValue( Kcp09V05LimitTable.class );
    }

  }
