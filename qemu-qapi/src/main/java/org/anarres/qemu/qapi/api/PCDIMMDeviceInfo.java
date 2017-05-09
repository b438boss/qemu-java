package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=PCDIMMDeviceInfo, data={*id=str, addr=int, size=int, slot=int, node=int, memdev=str, hotplugged=bool, hotpluggable=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=PCDIMMDeviceInfo, data={*id=str, addr=int, size=int, slot=int, node=int, memdev=str, hotplugged=bool, hotpluggable=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PCDIMMDeviceInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("id")
	@CheckForNull
	public java.lang.String id;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("addr")
	@Nonnull
	public long addr;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@Nonnull
	public long size;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("slot")
	@Nonnull
	public long slot;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("node")
	@Nonnull
	public long node;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("memdev")
	@Nonnull
	public java.lang.String memdev;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("hotplugged")
	@Nonnull
	public boolean hotplugged;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("hotpluggable")
	@Nonnull
	public boolean hotpluggable;

	@Nonnull
	public PCDIMMDeviceInfo withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withAddr(long value) {
		this.addr = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withSize(long value) {
		this.size = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withSlot(long value) {
		this.slot = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withNode(long value) {
		this.node = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withMemdev(java.lang.String value) {
		this.memdev = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withHotplugged(boolean value) {
		this.hotplugged = value;
		return this;
	}

	@Nonnull
	public PCDIMMDeviceInfo withHotpluggable(boolean value) {
		this.hotpluggable = value;
		return this;
	}

	public PCDIMMDeviceInfo() {
	}

	public PCDIMMDeviceInfo(java.lang.String id, long addr, long size, long slot, long node, java.lang.String memdev, boolean hotplugged, boolean hotpluggable) {
		this.id = id;
		this.addr = addr;
		this.size = size;
		this.slot = slot;
		this.node = node;
		this.memdev = memdev;
		this.hotplugged = hotplugged;
		this.hotpluggable = hotpluggable;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("id");
		names.add("addr");
		names.add("size");
		names.add("slot");
		names.add("node");
		names.add("memdev");
		names.add("hotplugged");
		names.add("hotpluggable");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("id".equals(name))
			return id;
		if ("addr".equals(name))
			return addr;
		if ("size".equals(name))
			return size;
		if ("slot".equals(name))
			return slot;
		if ("node".equals(name))
			return node;
		if ("memdev".equals(name))
			return memdev;
		if ("hotplugged".equals(name))
			return hotplugged;
		if ("hotpluggable".equals(name))
			return hotpluggable;
		return super.getFieldByName(name);
	}
}
