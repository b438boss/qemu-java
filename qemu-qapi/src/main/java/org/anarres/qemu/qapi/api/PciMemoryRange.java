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
 * <pre>QApiStructDescriptor{name=PciMemoryRange, data={base=int, limit=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=PciMemoryRange, data={base=int, limit=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PciMemoryRange extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("base")
	@Nonnull
	public long base;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("limit")
	@Nonnull
	public long limit;

	@Nonnull
	public PciMemoryRange withBase(long value) {
		this.base = value;
		return this;
	}

	@Nonnull
	public PciMemoryRange withLimit(long value) {
		this.limit = value;
		return this;
	}

	public PciMemoryRange() {
	}

	public PciMemoryRange(long base, long limit) {
		this.base = base;
		this.limit = limit;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("base");
		names.add("limit");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("base".equals(name))
			return base;
		if ("limit".equals(name))
			return limit;
		return super.getFieldByName(name);
	}
}
