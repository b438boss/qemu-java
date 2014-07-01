package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEventDescriptor{name=VNC_DISCONNECTED, data={server=VncServerInfo, client=VncClientInfo}}</pre></p>
 */
// QApiEventDescriptor{name=VNC_DISCONNECTED, data={server=VncServerInfo, client=VncClientInfo}}
public class VncDisconnectedEvent extends QApiEvent {
	@SerializedName("server")
	@Nonnull public VncServerInfo server;
	@SerializedName("client")
	@Nonnull public VncClientInfo client;
}
