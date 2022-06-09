package lotto.dto

import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.throwable.shouldHaveMessage

class UserMoneyInputDtoTest : DescribeSpec({
    describe("validate") {
        it("숫자가 아닌 경우 에러 발생") {
            // given
            val moneyByString = "not money"

            // then
            shouldThrowExactly<IllegalArgumentException> {
                UserMoneyInputDto(moneyByString)
            }.shouldHaveMessage("금액은 숫자를 입력해주세요")
        }
    }
})