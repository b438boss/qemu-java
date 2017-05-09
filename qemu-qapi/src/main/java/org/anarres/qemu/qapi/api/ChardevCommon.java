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
 * <pre>QApiStructDescriptor{name=ChardevCommon, data={*logfile=str, *logappend=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=ChardevCommon, data={*logfile=str, *logappend=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevCommon extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("logfile")
	@CheckForNull
	public java.lang.String logfile;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("logappend")
	@CheckForNull
	public java.lang.Boolean logappend;

	@Nonnull
	public ChardevCommon withLogfile(java.lang.String value) {
		this.logfile = value;
		return this;
	}

	@Nonnull
	public ChardevCommon withLogappend(java.lang.Boolean value) {
		this.logappend = value;
		return this;
	}

	public ChardevCommon() {
	}

	public ChardevCommon(java.lang.String logfile, java.lang.Boolean logappend) {
		this.logfile = logfile;
		this.logappend = logappend;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("logfile");
		names.add("logappend");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("logfile".equals(name))
			return logfile;
		if ("logappend".equals(name))
			return logappend;
		return super.getFieldByName(name);
	}
}
