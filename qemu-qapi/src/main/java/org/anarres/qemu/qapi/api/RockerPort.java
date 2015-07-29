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
 * <pre>QApiTypeDescriptor{name=RockerPort, data={name=str, enabled=bool, link-up=bool, speed=uint32, duplex=RockerPortDuplex, autoneg=RockerPortAutoneg}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=RockerPort, data={name=str, enabled=bool, link-up=bool, speed=uint32, duplex=RockerPortDuplex, autoneg=RockerPortAutoneg}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RockerPort extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("enabled")
	@Nonnull
	public boolean enabled;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("link-up")
	@Nonnull
	public boolean linkUp;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("speed")
	@Nonnull
	public long speed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("duplex")
	@Nonnull
	public RockerPortDuplex duplex;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("autoneg")
	@Nonnull
	public RockerPortAutoneg autoneg;

	@Nonnull
	public RockerPort withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public RockerPort withEnabled(boolean value) {
		this.enabled = value;
		return this;
	}

	@Nonnull
	public RockerPort withLinkUp(boolean value) {
		this.linkUp = value;
		return this;
	}

	@Nonnull
	public RockerPort withSpeed(long value) {
		this.speed = value;
		return this;
	}

	@Nonnull
	public RockerPort withDuplex(RockerPortDuplex value) {
		this.duplex = value;
		return this;
	}

	@Nonnull
	public RockerPort withAutoneg(RockerPortAutoneg value) {
		this.autoneg = value;
		return this;
	}

	public RockerPort() {
	}

	public RockerPort(java.lang.String name, boolean enabled, boolean linkUp, long speed, RockerPortDuplex duplex, RockerPortAutoneg autoneg) {
		this.name = name;
		this.enabled = enabled;
		this.linkUp = linkUp;
		this.speed = speed;
		this.duplex = duplex;
		this.autoneg = autoneg;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		names.add("enabled");
		names.add("link-up");
		names.add("speed");
		names.add("duplex");
		names.add("autoneg");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		if ("enabled".equals(name))
			return enabled;
		if ("link-up".equals(name))
			return linkUp;
		if ("speed".equals(name))
			return speed;
		if ("duplex".equals(name))
			return duplex;
		if ("autoneg".equals(name))
			return autoneg;
		return super.getFieldByName(name);
	}
}
