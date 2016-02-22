//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.RecogResult;
import	java.util.Random;
import	java.awt.Color;
import	jp.vstone.network.*;

public class mymain
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public CRobotPose pose;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,288,32,False,4,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,48,368,544,368,False,10,コメント@</BlockInfo>
	{
																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"はじめまして");																	//@<BlockInfo>jp.vstone.block.talk.say,112,368,112,368,False,9,@</BlockInfo>
																														//@<EndOfBlock/>
		recogresult = GlobalVariable.recog.getRecognition((int)10000);													//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,208,272,400,272,False,8,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
		speechRecogResult = recogresult.CheckBest(new String[]{
		 "こんにちは" ,  "こんばんわ" ,  "" , 
		},false);
		if(speechRecogResult == null) speechRecogResult = "";

		if(speechRecogResult.contains((String)"こんにちは"))
		{
			speechRecogResult = recogresult.getBasicResult();
			if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"こんにちは");																//@<BlockInfo>jp.vstone.block.talk.say,336,272,336,272,False,5,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

		}
		else if(speechRecogResult.contains((String)"こんばんわ"))
		{
			speechRecogResult = recogresult.getBasicResult();
			if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"こんばんわ");																//@<BlockInfo>jp.vstone.block.talk.say,336,368,336,368,False,6,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

		}
		else
		{
			speechRecogResult = recogresult.getBasicResult();
			if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"よくわかりません");															//@<BlockInfo>jp.vstone.block.talk.say,272,464,272,464,False,7,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

		}
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

}
