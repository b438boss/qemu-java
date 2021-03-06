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
 * <pre>QApiStructDescriptor{name=VersionInfo, data={qemu=VersionTriple, package=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=VersionInfo, data={qemu=VersionTriple, package=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VersionInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("qemu")
	@Nonnull
	public VersionTriple qemu;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("package")
	@Nonnull
	public java.lang.String _package;

	@Nonnull
	public VersionInfo withQemu(VersionTriple value) {
		this.qemu = value;
		return this;
	}

	@Nonnull
	public VersionInfo with_package(java.lang.String value) {
		this._package = value;
		return this;
	}

	public VersionInfo() {
	}

	public VersionInfo(VersionTriple qemu, java.lang.String _package) {
		this.qemu = qemu;
		this._package = _package;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("qemu");
		names.add("package");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("qemu".equals(name))
			return qemu;
		if ("package".equals(name))
			return _package;
		return super.getFieldByName(name);
	}
}
