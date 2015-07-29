package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=DirtyBitmapStatus, data=[active, disabled, frozen], fields=null}</pre>
 */
// QApiEnumDescriptor{name=DirtyBitmapStatus, data=[active, disabled, frozen], fields=null}
public enum DirtyBitmapStatus {
	active("active"),
	disabled("disabled"),
	frozen("frozen"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ DirtyBitmapStatus(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
