package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=BlockdevOnError, data=[report, ignore, enospc, stop], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=BlockdevOnError, data=[report, ignore, enospc, stop], fields=null}
public enum BlockdevOnError {
	@SerializedName("report")
	report,
	@SerializedName("ignore")
	ignore,
	@SerializedName("enospc")
	enospc,
	@SerializedName("stop")
	stop,
	__UNKNOWN;
}
