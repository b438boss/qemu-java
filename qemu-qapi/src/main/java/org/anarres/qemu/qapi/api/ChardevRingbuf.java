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
 * <pre>QApiStructDescriptor{name=ChardevRingbuf, data={*size=int}, innerTypes=null, fields=null, base=ChardevCommon}</pre>
 */
// QApiStructDescriptor{name=ChardevRingbuf, data={*size=int}, innerTypes=null, fields=null, base=ChardevCommon}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevRingbuf extends ChardevCommon {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@CheckForNull
	public java.lang.Long size;

	@Nonnull
	public ChardevRingbuf withSize(java.lang.Long value) {
		this.size = value;
		return this;
	}

	public ChardevRingbuf() {
	}

	public ChardevRingbuf(java.lang.Long size) {
		this.size = size;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("size");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("size".equals(name))
			return size;
		return super.getFieldByName(name);
	}
}
