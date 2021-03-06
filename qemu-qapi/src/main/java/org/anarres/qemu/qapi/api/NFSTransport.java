package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=NFSTransport, data=[inet], fields=null}</pre>
 */
// QApiEnumDescriptor{name=NFSTransport, data=[inet], fields=null}
public enum NFSTransport {
	inet("inet"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ NFSTransport(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
