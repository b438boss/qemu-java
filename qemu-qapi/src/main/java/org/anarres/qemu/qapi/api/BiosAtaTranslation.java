package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BiosAtaTranslation, data=[auto, none, lba, large, rechs], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BiosAtaTranslation, data=[auto, none, lba, large, rechs], fields=null}
public enum BiosAtaTranslation {
	auto("auto"),
	none("none"),
	lba("lba"),
	large("large"),
	rechs("rechs"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BiosAtaTranslation(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
