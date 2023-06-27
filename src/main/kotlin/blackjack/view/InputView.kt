package blackjack.view

import blackjack.player.Status

object InputView {
    fun readPlayers(): List<String> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        val players = readLine()?.split(",")?.map { it.trim() } ?: throw IllegalArgumentException("입력이 잘못되었습니다.")
        players.map { println(it) }
        return players
    }

    fun readWantOrStand(playerName: String): Status {
        println("$playerName 는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        val response = readLine() ?: throw IllegalArgumentException("입력이 잘못되었습니다.")
        return if (response == "y") Status.WANT else Status.STAND
    }
}
