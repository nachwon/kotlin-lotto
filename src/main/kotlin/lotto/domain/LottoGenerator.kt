package lotto.domain

class LottoGenerator {

    fun generate(paidPrice: Money): List<Lotto> {
        val numberOfLottoToGenerate = getNumberOfLottoToGenerate(Lotto.UNIT_PRICE, paidPrice)
        return (1..numberOfLottoToGenerate).map { createLotto() }
    }

    private fun getNumberOfLottoToGenerate(lottoPrice: Money, paidPrice: Money): Int {
        return paidPrice / lottoPrice
    }

    private fun createLotto(): Lotto {
        val numbers = LOTTO_NUMBERS.shuffled().take(LOTTO_NUMBERS_COUNT)
        return Lotto(numbers)
    }

    companion object {
        private val LOTTO_NUMBERS = (1..45).map { LottoNumber(it) }
        private const val LOTTO_NUMBERS_COUNT = 6
    }
}
