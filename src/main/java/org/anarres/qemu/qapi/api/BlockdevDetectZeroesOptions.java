package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=BlockdevDetectZeroesOptions, data=[off, on, unmap], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=BlockdevDetectZeroesOptions, data=[off, on, unmap], fields=null}
public enum BlockdevDetectZeroesOptions {
	@SerializedName("off")
	off,
	@SerializedName("on")
	on,
	@SerializedName("unmap")
	unmap,
	__UNKNOWN;
}
