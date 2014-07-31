package net.raehik.wikiquiz;


public class Main {
	public static void main(String[] args) {
		WikiArticleRead test = new WikiArticleRead();
		String readWiki = test.wikiDownload("Viking", true);
		QuestionFinder qf = new QuestionFinder();
		String[] arraywiki = qf.sentenceParse(readWiki);
		System.out.println(arraywiki[0]);
	}

}
