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
 * <pre>QApiStructDescriptor{name=BlkdebugSetStateOptions, data={event=BlkdebugEvent, *state=int, new_state=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlkdebugSetStateOptions, data={event=BlkdebugEvent, *state=int, new_state=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlkdebugSetStateOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("event")
	@Nonnull
	public BlkdebugEvent event;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("state")
	@CheckForNull
	public java.lang.Long state;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("new_state")
	@Nonnull
	public long newState;

	@Nonnull
	public BlkdebugSetStateOptions withEvent(BlkdebugEvent value) {
		this.event = value;
		return this;
	}

	@Nonnull
	public BlkdebugSetStateOptions withState(java.lang.Long value) {
		this.state = value;
		return this;
	}

	@Nonnull
	public BlkdebugSetStateOptions withNewState(long value) {
		this.newState = value;
		return this;
	}

	public BlkdebugSetStateOptions() {
	}

	public BlkdebugSetStateOptions(BlkdebugEvent event, java.lang.Long state, long newState) {
		this.event = event;
		this.state = state;
		this.newState = newState;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("event");
		names.add("state");
		names.add("new_state");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("event".equals(name))
			return event;
		if ("state".equals(name))
			return state;
		if ("new_state".equals(name))
			return newState;
		return super.getFieldByName(name);
	}
}
