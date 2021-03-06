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
 * <pre>QApiStructDescriptor{name=VsockSocketAddress, data={cid=str, port=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=VsockSocketAddress, data={cid=str, port=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VsockSocketAddress extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cid")
	@Nonnull
	public java.lang.String cid;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("port")
	@Nonnull
	public java.lang.String port;

	@Nonnull
	public VsockSocketAddress withCid(java.lang.String value) {
		this.cid = value;
		return this;
	}

	@Nonnull
	public VsockSocketAddress withPort(java.lang.String value) {
		this.port = value;
		return this;
	}

	public VsockSocketAddress() {
	}

	public VsockSocketAddress(java.lang.String cid, java.lang.String port) {
		this.cid = cid;
		this.port = port;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("cid");
		names.add("port");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("cid".equals(name))
			return cid;
		if ("port".equals(name))
			return port;
		return super.getFieldByName(name);
	}
}
