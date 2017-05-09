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
 * <pre>QApiStructDescriptor{name=TPMPassthroughOptions, data={*path=str, *cancel-path=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=TPMPassthroughOptions, data={*path=str, *cancel-path=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TPMPassthroughOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("path")
	@CheckForNull
	public java.lang.String path;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cancel-path")
	@CheckForNull
	public java.lang.String cancelPath;

	@Nonnull
	public TPMPassthroughOptions withPath(java.lang.String value) {
		this.path = value;
		return this;
	}

	@Nonnull
	public TPMPassthroughOptions withCancelPath(java.lang.String value) {
		this.cancelPath = value;
		return this;
	}

	public TPMPassthroughOptions() {
	}

	public TPMPassthroughOptions(java.lang.String path, java.lang.String cancelPath) {
		this.path = path;
		this.cancelPath = cancelPath;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("path");
		names.add("cancel-path");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("path".equals(name))
			return path;
		if ("cancel-path".equals(name))
			return cancelPath;
		return super.getFieldByName(name);
	}
}
