package OPENBEXI_Timeline;

/**
 * Generated from IDL alias "resources".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Nov 25, 2012 5:27:08 PM
 */

public final class resourcesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, OPENBEXI_Timeline.resource[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static OPENBEXI_Timeline.resource[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(OPENBEXI_Timeline.resourcesHelper.id(), "resources",org.omg.CORBA.ORB.init().create_sequence_tc(0, OPENBEXI_Timeline.resourceHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:OPENBEXI_Timeline/resources:1.0";
	}
	public static OPENBEXI_Timeline.resource[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		OPENBEXI_Timeline.resource[] _result;
		int _l_result6 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result6 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result6);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new OPENBEXI_Timeline.resource[_l_result6];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=OPENBEXI_Timeline.resourceHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, OPENBEXI_Timeline.resource[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			OPENBEXI_Timeline.resourceHelper.write(_out,_s[i]);
		}

	}
}
