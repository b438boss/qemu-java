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
 * <pre>QApiStructDescriptor{name=KvmInfo, data={enabled=bool, present=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=KvmInfo, data={enabled=bool, present=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class KvmInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("enabled")
	@Nonnull
	public boolean enabled;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("present")
	@Nonnull
	public boolean present;

	@Nonnull
	public KvmInfo withEnabled(boolean value) {
		this.enabled = value;
		return this;
	}

	@Nonnull
	public KvmInfo withPresent(boolean value) {
		this.present = value;
		return this;
	}

	public KvmInfo() {
	}

	public KvmInfo(boolean enabled, boolean present) {
		this.enabled = enabled;
		this.present = present;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("enabled");
		names.add("present");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("enabled".equals(name))
			return enabled;
		if ("present".equals(name))
			return present;
		return super.getFieldByName(name);
	}
}
