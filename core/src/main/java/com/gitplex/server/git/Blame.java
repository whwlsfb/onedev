package com.gitplex.server.git;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.gitplex.jsymbol.Range;

public class Blame {
	
	private final Commit commit;

	private final List<Range> ranges;
	
	public Blame(Commit commit, List<Range> ranges) {
		this.commit = commit;
		this.ranges = ranges;
	}

	public Commit getCommit() {
		return commit;
	}
	
	public List<Range> getRanges() {
		return ranges;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(commit.getHash()).append(": ");
		for (Range range: ranges) 
			builder.append(range).append(", ");
		
		return StringUtils.stripEnd(builder.toString(), ", ");
	}

}
