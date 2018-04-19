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
 * <pre>QApiStructDescriptor{name=BlockdevOptionsVVFAT, data={dir=str, *fat-type=int, *floppy=bool, *label=str, *rw=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsVVFAT, data={dir=str, *fat-type=int, *floppy=bool, *label=str, *rw=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsVVFAT extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dir")
	@Nonnull
	public java.lang.String dir;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fat-type")
	@CheckForNull
	public java.lang.Long fatType;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("floppy")
	@CheckForNull
	public java.lang.Boolean floppy;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("label")
	@CheckForNull
	public java.lang.String label;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rw")
	@CheckForNull
	public java.lang.Boolean rw;

	@Nonnull
	public BlockdevOptionsVVFAT withDir(java.lang.String value) {
		this.dir = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsVVFAT withFatType(java.lang.Long value) {
		this.fatType = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsVVFAT withFloppy(java.lang.Boolean value) {
		this.floppy = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsVVFAT withLabel(java.lang.String value) {
		this.label = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsVVFAT withRw(java.lang.Boolean value) {
		this.rw = value;
		return this;
	}

	public BlockdevOptionsVVFAT() {
	}

	public BlockdevOptionsVVFAT(java.lang.String dir, java.lang.Long fatType, java.lang.Boolean floppy, java.lang.String label, java.lang.Boolean rw) {
		this.dir = dir;
		this.fatType = fatType;
		this.floppy = floppy;
		this.label = label;
		this.rw = rw;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("dir");
		names.add("fat-type");
		names.add("floppy");
		names.add("label");
		names.add("rw");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("dir".equals(name))
			return dir;
		if ("fat-type".equals(name))
			return fatType;
		if ("floppy".equals(name))
			return floppy;
		if ("label".equals(name))
			return label;
		if ("rw".equals(name))
			return rw;
		return super.getFieldByName(name);
	}
}
