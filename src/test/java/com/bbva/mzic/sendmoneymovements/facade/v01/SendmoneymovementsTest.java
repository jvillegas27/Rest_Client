package com.bbva.mzic.sendmoneymovements.facade.v01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapResponse;
import com.bbva.mzic.sendmoneymovements.facade.v01.impl.CreateTransactionByFlapImpl;
import com.bbva.mzic.sendmoneymovements.facade.v01.impl.SendMoneyMovementsImpl;
import com.bbva.mzic.utils.NotResponse;
import com.bbva.util.TestUtilContext;

@RunWith(MockitoJUnitRunner.class)
public class SendmoneymovementsTest extends TestUtilContext{

	private SendMoneyMovementsImpl sendMoneyMovementsImpl;
	private CreateTransactionByFlapImpl createTransactionByFlapImpl;
	
	@Before
	public void init(){
		sendMoneyMovementsImpl = new SendMoneyMovementsImpl();
		createTransactionByFlapImpl = new CreateTransactionByFlapImpl();
	}
	
	@Test
//	@Ignore
	public void sendTransactionFlapTest(){
		NotResponse res = sendMoneyMovementsImpl.petitionPost(super.getEnv().getProperty("st.URL"), 
				super.getEnv().getProperty("st.sendTransactionFlap.PATH"));
		Assert.assertEquals(null, res);
	}
	
	@Test
	public void createTransactionByFlapTest(){
		DtoPaymentByFlapResponse res = createTransactionByFlapImpl.petitionPost(DtoPaymentByFlapResponse.class ,super.getEnv().getProperty("st.URL"), 
				super.getEnv().getProperty("st.createTransactionByFlap.PATH"));
		Assert.assertNotNull(res);
		Assert.assertEquals("27272727", res.getMovementId());
	}
	
}
