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
 * <pre>QApiStructDescriptor{name=ChardevReturn, data={*pty=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=ChardevReturn, data={*pty=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevReturn extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("pty")
	@CheckForNull
	public java.lang.String pty;

	@Nonnull
	public ChardevReturn withPty(java.lang.String value) {
		this.pty = value;
		return this;
	}

	public ChardevReturn() {
	}

	public ChardevReturn(java.lang.String pty) {
		this.pty = pty;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("pty");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("pty".equals(name))
			return pty;
		return super.getFieldByName(name);
	}
}
