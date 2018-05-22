package org.incode.eurocommercial.contactapp.dom.audit.contracts.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes28;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.1.
 */
public class AuditTrail extends Contract {
    private static final String BINARY = "0x608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555061061b806100606000396000f300608060405260043610610083576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806341c0e1b514610088578063787802f61461009f5780638da5cb5b146100ca5780638e598f18146101215780639d9fef8414610170578063cce315ea146101b2578063d272817b14610202575b600080fd5b34801561009457600080fd5b5061009d610244565b005b3480156100ab57600080fd5b506100b46102d9565b6040518082815260200191505060405180910390f35b3480156100d657600080fd5b506100df6102e6565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561012d57600080fd5b5061014c6004803603810190808035906020019092919050505061030b565b604051808263ffffffff191663ffffffff1916815260200191505060405180910390f35b34801561017c57600080fd5b506101b0600480360381019080803563ffffffff19169060200190929190803560001916906020019092919050505061033a565b005b3480156101be57600080fd5b506101e4600480360381019080803563ffffffff19169060200190929190505050610433565b60405180826000191660001916815260200191505060405180910390f35b34801561020e57600080fd5b50610242600480360381019080803563ffffffff19169060200190929190803560001916906020019092919050505061044b565b005b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561029f57600080fd5b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16ff5b6000600180549050905090565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60018181548110151561031a57fe5b906000526020600020016000915054906101000a90046401000000000281565b8060001916600260008463ffffffff191663ffffffff1916815260200190815260200160002054600019161415156103da576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260188152602001807f4861736865732073686f756c6420636f72726573706f6e64000000000000000081525060200191505060405180910390fd5b7f65c5dc4751562e974bfe71e30f4738e7824976b8edf849f6dacd9699e8bb9d0e8282604051808363ffffffff191663ffffffff1916815260200182600019166000191681526020019250505060405180910390a15050565b60026020528060005260406000206000915090505481565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156104a657600080fd5b6000600102600260008463ffffffff191663ffffffff19168152602001908152602001600020546000191614151561056c576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260268152602001807f41207472616e73616374696f6e2063616e206f6e6c792062652061756469746581526020017f64206f6e6365000000000000000000000000000000000000000000000000000081525060400191505060405180910390fd5b80600260008463ffffffff191663ffffffff1916815260200190815260200160002081600019169055507fdd1302982979fadb5454d575982f114bef9dccf8c49bcb66e3c9af8f0fefcc878282604051808363ffffffff191663ffffffff1916815260200182600019166000191681526020019250505060405180910390a150505600a165627a7a7230582065cb67d900224eac473ff382cd9a706a5923836546f9b11d7f2bf9ba6b26bfe00029";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<>();
    }

    protected AuditTrail(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected AuditTrail(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<AuditEventResponse> getAuditEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Audit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes28>() {}, new TypeReference<Bytes32>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<AuditEventResponse> responses = new ArrayList<AuditEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AuditEventResponse typedResponse = new AuditEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.transactionIdentifier = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.transactionHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AuditEventResponse> auditEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Audit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes28>() {}, new TypeReference<Bytes32>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, AuditEventResponse>() {
            @Override
            public AuditEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                AuditEventResponse typedResponse = new AuditEventResponse();
                typedResponse.log = log;
                typedResponse.transactionIdentifier = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.transactionHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<ValidateEventResponse> getValidateEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Validate", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes28>() {}, new TypeReference<Bytes32>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<ValidateEventResponse> responses = new ArrayList<ValidateEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ValidateEventResponse typedResponse = new ValidateEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.transactionIdentifier = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.transactionHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ValidateEventResponse> validateEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Validate", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes28>() {}, new TypeReference<Bytes32>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ValidateEventResponse>() {
            @Override
            public ValidateEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                ValidateEventResponse typedResponse = new ValidateEventResponse();
                typedResponse.log = log;
                typedResponse.transactionIdentifier = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.transactionHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<String> owner() {
        final Function function = new Function("owner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> auditedTransactions(BigInteger param0) {
        final Function function = new Function("auditedTransactions", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes28>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> transactionHashes(byte[] param0) {
        final Function function = new Function("transactionHashes", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes28(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<AuditTrail> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AuditTrail.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<AuditTrail> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AuditTrail.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteCall<BigInteger> getAuditedTransactionsCount() {
        final Function function = new Function("getAuditedTransactionsCount", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> kill() {
        final Function function = new Function(
                "kill", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> audit(byte[] transactionIdentifier, byte[] transactionHash) {
        final Function function = new Function(
                "audit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes28(transactionIdentifier), 
                new org.web3j.abi.datatypes.generated.Bytes32(transactionHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> validate(byte[] transactionIdentifier, byte[] transactionHash) {
        final Function function = new Function(
                "validate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes28(transactionIdentifier), 
                new org.web3j.abi.datatypes.generated.Bytes32(transactionHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static AuditTrail load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new AuditTrail(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static AuditTrail load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new AuditTrail(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class AuditEventResponse {
        public Log log;

        public byte[] transactionIdentifier;

        public byte[] transactionHash;
    }

    public static class ValidateEventResponse {
        public Log log;

        public byte[] transactionIdentifier;

        public byte[] transactionHash;
    }
}
