package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=MigrationCapability, data=[xbzrle, rdma-pin-all, auto-converge, zero-blocks], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=MigrationCapability, data=[xbzrle, rdma-pin-all, auto-converge, zero-blocks], fields=null}
public enum MigrationCapability {
	@SerializedName("xbzrle")
	xbzrle,
	@SerializedName("rdma-pin-all")
	rdma_pin_all,
	@SerializedName("auto-converge")
	auto_converge,
	@SerializedName("zero-blocks")
	zero_blocks,
	__UNKNOWN;
}
