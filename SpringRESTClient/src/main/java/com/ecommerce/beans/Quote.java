package com.ecommerce.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private String _id;
	private String content;
	private String author;
	private String authorSlugs;
	private int length;
	private String[] tags;

	public Quote() {
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorSlugs() {
		return authorSlugs;
	}

	public void setAuthorSlugs(String authorSlugs) {
		this.authorSlugs = authorSlugs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Quote [_id=" + _id + ", content=" + content + ", author=" + author + ", authorSlugs=" + authorSlugs
				+ ", length=" + length + ", tags=" + Arrays.toString(tags) + "]";
	}

}
