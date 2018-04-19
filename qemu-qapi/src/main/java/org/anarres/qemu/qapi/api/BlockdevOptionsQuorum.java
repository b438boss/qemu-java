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
 * <pre>QApiStructDescriptor{name=BlockdevOptionsQuorum, data={*blkverify=bool, children=[BlockdevRef], vote-threshold=int, *rewrite-corrupted=bool, *read-pattern=QuorumReadPattern}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsQuorum, data={*blkverify=bool, children=[BlockdevRef], vote-threshold=int, *rewrite-corrupted=bool, *read-pattern=QuorumReadPattern}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsQuorum extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("blkverify")
	@CheckForNull
	public java.lang.Boolean blkverify;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("children")
	@Nonnull
	public java.util.List<BlockdevRef> children;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vote-threshold")
	@Nonnull
	public long voteThreshold;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rewrite-corrupted")
	@CheckForNull
	public java.lang.Boolean rewriteCorrupted;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("read-pattern")
	@CheckForNull
	public QuorumReadPattern readPattern;

	@Nonnull
	public BlockdevOptionsQuorum withBlkverify(java.lang.Boolean value) {
		this.blkverify = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withChildren(java.util.List<BlockdevRef> value) {
		this.children = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withVoteThreshold(long value) {
		this.voteThreshold = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withRewriteCorrupted(java.lang.Boolean value) {
		this.rewriteCorrupted = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withReadPattern(QuorumReadPattern value) {
		this.readPattern = value;
		return this;
	}

	public BlockdevOptionsQuorum() {
	}

	public BlockdevOptionsQuorum(java.lang.Boolean blkverify, java.util.List<BlockdevRef> children, long voteThreshold, java.lang.Boolean rewriteCorrupted, QuorumReadPattern readPattern) {
		this.blkverify = blkverify;
		this.children = children;
		this.voteThreshold = voteThreshold;
		this.rewriteCorrupted = rewriteCorrupted;
		this.readPattern = readPattern;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("blkverify");
		names.add("children");
		names.add("vote-threshold");
		names.add("rewrite-corrupted");
		names.add("read-pattern");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("blkverify".equals(name))
			return blkverify;
		if ("children".equals(name))
			return children;
		if ("vote-threshold".equals(name))
			return voteThreshold;
		if ("rewrite-corrupted".equals(name))
			return rewriteCorrupted;
		if ("read-pattern".equals(name))
			return readPattern;
		return super.getFieldByName(name);
	}
}
