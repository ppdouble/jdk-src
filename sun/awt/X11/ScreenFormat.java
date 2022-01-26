// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class ScreenFormat extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 24; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public ScreenFormat(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public ScreenFormat() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public XExtData get_ext_data(int index) { log.finest(""); return (Native.getLong(pData+0) != 0)?(new XExtData(Native.getLong(pData+0)+index*32)):(null); }
	public long get_ext_data() { log.finest("");return Native.getLong(pData+0); }
	public void set_ext_data(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public int get_depth() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_depth(int v) { log.finest(""); Native.putInt(pData+8, v); }
	public int get_bits_per_pixel() { log.finest("");return (Native.getInt(pData+12)); }
	public void set_bits_per_pixel(int v) { log.finest(""); Native.putInt(pData+12, v); }
	public int get_scanline_pad() { log.finest("");return (Native.getInt(pData+16)); }
	public void set_scanline_pad(int v) { log.finest(""); Native.putInt(pData+16, v); }


	String getName() {
		return "ScreenFormat"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(160);

		ret.append("ext_data = ").append( get_ext_data() ).append(", ");
		ret.append("depth = ").append( get_depth() ).append(", ");
		ret.append("bits_per_pixel = ").append( get_bits_per_pixel() ).append(", ");
		ret.append("scanline_pad = ").append( get_scanline_pad() ).append(", ");
		return ret.toString();
	}


}



