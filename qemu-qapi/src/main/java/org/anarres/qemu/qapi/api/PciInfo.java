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
 * <pre>QApiStructDescriptor{name=PciInfo, data={bus=int, devices=[PciDeviceInfo]}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=PciInfo, data={bus=int, devices=[PciDeviceInfo]}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PciInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bus")
	@Nonnull
	public long bus;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("devices")
	@Nonnull
	public java.util.List<PciDeviceInfo> devices;

	@Nonnull
	public PciInfo withBus(long value) {
		this.bus = value;
		return this;
	}

	@Nonnull
	public PciInfo withDevices(java.util.List<PciDeviceInfo> value) {
		this.devices = value;
		return this;
	}

	public PciInfo() {
	}

	public PciInfo(long bus, java.util.List<PciDeviceInfo> devices) {
		this.bus = bus;
		this.devices = devices;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("bus");
		names.add("devices");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("bus".equals(name))
			return bus;
		if ("devices".equals(name))
			return devices;
		return super.getFieldByName(name);
	}
}
