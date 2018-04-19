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
 * <pre>QApiStructDescriptor{name=SchemaInfoObject, data={members=[SchemaInfoObjectMember], *tag=str, *variants=[SchemaInfoObjectVariant]}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=SchemaInfoObject, data={members=[SchemaInfoObjectMember], *tag=str, *variants=[SchemaInfoObjectVariant]}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SchemaInfoObject extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("members")
	@Nonnull
	public java.util.List<SchemaInfoObjectMember> members;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tag")
	@CheckForNull
	public java.lang.String tag;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("variants")
	@CheckForNull
	public java.util.List<SchemaInfoObjectVariant> variants;

	@Nonnull
	public SchemaInfoObject withMembers(java.util.List<SchemaInfoObjectMember> value) {
		this.members = value;
		return this;
	}

	@Nonnull
	public SchemaInfoObject withTag(java.lang.String value) {
		this.tag = value;
		return this;
	}

	@Nonnull
	public SchemaInfoObject withVariants(java.util.List<SchemaInfoObjectVariant> value) {
		this.variants = value;
		return this;
	}

	public SchemaInfoObject() {
	}

	public SchemaInfoObject(java.util.List<SchemaInfoObjectMember> members, java.lang.String tag, java.util.List<SchemaInfoObjectVariant> variants) {
		this.members = members;
		this.tag = tag;
		this.variants = variants;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("members");
		names.add("tag");
		names.add("variants");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("members".equals(name))
			return members;
		if ("tag".equals(name))
			return tag;
		if ("variants".equals(name))
			return variants;
		return super.getFieldByName(name);
	}
}
