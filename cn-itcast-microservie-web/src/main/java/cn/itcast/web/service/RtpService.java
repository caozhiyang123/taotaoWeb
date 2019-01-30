package cn.itcast.web.service;

import cn.itcast.web.io.SlotRtpResult;
import cn.itcast.web.io.VBRtpResult;

public interface RtpService
{

    VBRtpResult queryVbRtpByGameId(int gameId, String timeFrom, String timeTo);

    SlotRtpResult querySlotRtpByGameId(int gameId, String timeFrom, String timeTo);

}
