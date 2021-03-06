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
 * <pre>QApiTypeDescriptor{name=BlockdevCreateOptionsBase, data={driver=BlockdevDriver}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockdevCreateOptionsBase, data={driver=BlockdevDriver}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCreateOptionsBase extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("driver")
	@Nonnull
	public BlockdevDriver driver;

	@Nonnull
	public BlockdevCreateOptionsBase withDriver(BlockdevDriver value) {
		this.driver = value;
		return this;
	}

	public BlockdevCreateOptionsBase() {
	}

	public BlockdevCreateOptionsBase(BlockdevDriver driver) {
		this.driver = driver;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("driver");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("driver".equals(name))
			return driver;
		return super.getFieldByName(name);
	}
}
