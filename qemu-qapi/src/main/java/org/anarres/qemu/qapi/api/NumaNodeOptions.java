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
 * <pre>QApiStructDescriptor{name=NumaNodeOptions, data={*nodeid=uint16, *cpus=[uint16], *mem=size, *memdev=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=NumaNodeOptions, data={*nodeid=uint16, *cpus=[uint16], *mem=size, *memdev=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NumaNodeOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("nodeid")
	@CheckForNull
	public java.lang.Integer nodeid;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cpus")
	@CheckForNull
	public java.util.List<java.lang.Integer> cpus;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("mem")
	@CheckForNull
	public java.lang.Long mem;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("memdev")
	@CheckForNull
	public java.lang.String memdev;

	@Nonnull
	public NumaNodeOptions withNodeid(java.lang.Integer value) {
		this.nodeid = value;
		return this;
	}

	@Nonnull
	public NumaNodeOptions withCpus(java.util.List<java.lang.Integer> value) {
		this.cpus = value;
		return this;
	}

	@Nonnull
	public NumaNodeOptions withMem(java.lang.Long value) {
		this.mem = value;
		return this;
	}

	@Nonnull
	public NumaNodeOptions withMemdev(java.lang.String value) {
		this.memdev = value;
		return this;
	}

	public NumaNodeOptions() {
	}

	public NumaNodeOptions(java.lang.Integer nodeid, java.util.List<java.lang.Integer> cpus, java.lang.Long mem, java.lang.String memdev) {
		this.nodeid = nodeid;
		this.cpus = cpus;
		this.mem = mem;
		this.memdev = memdev;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("nodeid");
		names.add("cpus");
		names.add("mem");
		names.add("memdev");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("nodeid".equals(name))
			return nodeid;
		if ("cpus".equals(name))
			return cpus;
		if ("mem".equals(name))
			return mem;
		if ("memdev".equals(name))
			return memdev;
		return super.getFieldByName(name);
	}
}
