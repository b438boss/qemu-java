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
 * <pre>QApiStructDescriptor{name=DummyForceArrays, data={unused=[X86CPUFeatureWordInfo]}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=DummyForceArrays, data={unused=[X86CPUFeatureWordInfo]}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DummyForceArrays extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("unused")
	@Nonnull
	public java.util.List<X86CPUFeatureWordInfo> unused;

	@Nonnull
	public DummyForceArrays withUnused(java.util.List<X86CPUFeatureWordInfo> value) {
		this.unused = value;
		return this;
	}

	public DummyForceArrays() {
	}

	public DummyForceArrays(java.util.List<X86CPUFeatureWordInfo> unused) {
		this.unused = unused;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("unused");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("unused".equals(name))
			return unused;
		return super.getFieldByName(name);
	}
}
