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
 * <pre>QApiStructDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool, *queues=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool, *queues=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevVhostUserOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("chardev")
	@Nonnull
	public java.lang.String chardev;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vhostforce")
	@CheckForNull
	public java.lang.Boolean vhostforce;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("queues")
	@CheckForNull
	public java.lang.Long queues;

	@Nonnull
	public NetdevVhostUserOptions withChardev(java.lang.String value) {
		this.chardev = value;
		return this;
	}

	@Nonnull
	public NetdevVhostUserOptions withVhostforce(java.lang.Boolean value) {
		this.vhostforce = value;
		return this;
	}

	@Nonnull
	public NetdevVhostUserOptions withQueues(java.lang.Long value) {
		this.queues = value;
		return this;
	}

	public NetdevVhostUserOptions() {
	}

	public NetdevVhostUserOptions(java.lang.String chardev, java.lang.Boolean vhostforce, java.lang.Long queues) {
		this.chardev = chardev;
		this.vhostforce = vhostforce;
		this.queues = queues;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("chardev");
		names.add("vhostforce");
		names.add("queues");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("chardev".equals(name))
			return chardev;
		if ("vhostforce".equals(name))
			return vhostforce;
		if ("queues".equals(name))
			return queues;
		return super.getFieldByName(name);
	}
}
